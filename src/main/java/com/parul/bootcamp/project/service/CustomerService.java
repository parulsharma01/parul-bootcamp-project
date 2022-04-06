package com.parul.bootcamp.project.service;

import com.parul.bootcamp.project.dto.CustomerDTO;
import com.parul.bootcamp.project.entities.Customer;
import com.parul.bootcamp.project.entities.User;
import com.parul.bootcamp.project.exceptions.BadRequestException;
import com.parul.bootcamp.project.repos.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

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
        System.out.println("Customer ENtity"+ customerDTO);
        User user = modelMapper.map(customerDTO, User.class);
        Customer customer = modelMapper.map(customerDTO, Customer.class);
        System.out.println("Customer contact"+ customerDTO.getContact());
        customer.setUser(user);

        String confirmPassword = customerDTO.getConfirmPassword();
        if (! customerDTO.getPassword().equals(confirmPassword)) {
            throw new BadRequestException("Confirm Password donot match.");
        }

        customerRepository.save(customer);
        return customer;
    }

}

