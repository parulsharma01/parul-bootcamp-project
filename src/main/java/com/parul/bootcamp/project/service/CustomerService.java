package com.parul.bootcamp.project.service;

import com.parul.bootcamp.project.dto.CustomerDTO;
import com.parul.bootcamp.project.entities.Customer;
import com.parul.bootcamp.project.entities.Token;
import com.parul.bootcamp.project.entities.User;
import com.parul.bootcamp.project.exceptions.BadRequestException;
import com.parul.bootcamp.project.repos.CustomerRepository;
import com.parul.bootcamp.project.repos.TokenRepository;
import com.parul.bootcamp.project.repos.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    TokenService tokenService;
    @Autowired
    EmailService emailService;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ModelMapper modelMapper;

    public List<Customer> getAllCustomers()
    {
        List<Customer> customers = new ArrayList<Customer>();
        customerRepository.findAll().forEach(curCustomer -> customers.add(curCustomer));
        return customers;
    }

    public Customer getCustomerById(int id)
    {
        return customerRepository.findById(id).get();
    }

    public Customer registerCustomer(CustomerDTO customerDTO)
    {
        User user = modelMapper.map(customerDTO, User.class);
        Customer customer = modelMapper.map(customerDTO, Customer.class);
        customer.setUser(user);

        String confirmPassword = customerDTO.getConfirmPassword();
        if (! customerDTO.getPassword().equals(confirmPassword)) {
            throw new BadRequestException("Confirm Password did not match.");
        }
        Token token = tokenService.generateActivationToken(user);
        String message = "Complete your Account registration.\n" +
                "Your Token is : "+ token.getActivationToken();
        emailService.sendSimpleMessage(user.getEmail(), "Activate Account using Token",message);
        customerRepository.save(customer);
        return customer;
    }

    public User activateUserByToken(Token token){
        User user= userRepository.findByEmail(token.getUserEmail());
        Token validToken = tokenService.validateToken(token);
        if (validToken == null) {
            throw new BadRequestException("Invalid Token");
        }else if(user==null){
                throw new BadRequestException("User with this email doesn't exist");
        }else{
            user.setActive(true);
        }
        return user;
    }

}

