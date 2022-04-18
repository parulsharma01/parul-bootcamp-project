package com.parul.bootcamp.project.controller;

import com.parul.bootcamp.project.dto.CustomerDTO;
import com.parul.bootcamp.project.entities.Customer;
import com.parul.bootcamp.project.exceptions.BadRequestException;
import com.parul.bootcamp.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.*;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    @ResponseBody
    public Customer getCustomerById(@PathParam("id") Integer customerId){
        return customerService.getCustomerById(customerId);
    }

}
