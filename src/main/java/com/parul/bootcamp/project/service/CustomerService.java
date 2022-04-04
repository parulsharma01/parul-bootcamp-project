package com.parul.bootcamp.project.service;

import com.parul.bootcamp.project.dto.CustomerDTO;
import com.parul.bootcamp.project.entities.Customer;
import com.parul.bootcamp.project.entities.User;
import com.parul.bootcamp.project.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

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

    public Customer saveOrUpdate(CustomerDTO customerDTO)
    {
        User user = new User();
        user.setEmail(customerDTO.getEmail());
        user.setFirstName(customerDTO.getFirstName());
        user.setMiddleName(customerDTO.getMiddleName());
        user.setLastName(customerDTO.getLastName());
        user.setPassword(customerDTO.getPassword());
        user.setRoles(customerDTO.getRoles());
        user.setPasswordUpdateDate(customerDTO.getPasswordUpdateDate());

        Customer customer = new Customer();
        customer.setUser(user);
        customer.setContact(customerDTO.getContactNumber());

        String confirmPassword = customerDTO.getConfirmPassword();
        if (! customerDTO.getPassword().equals(confirmPassword)) {
            return null;
        }

        customerRepository.save(customer);
        return customer;
    }

}

