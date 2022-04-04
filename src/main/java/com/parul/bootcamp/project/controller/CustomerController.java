package com.parul.bootcamp.project.controller;

import com.parul.bootcamp.project.dto.CustomerDTO;
import com.parul.bootcamp.project.entities.Customer;
import com.parul.bootcamp.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/customer")
    @ResponseBody
    public Customer getCustomerById(@RequestParam int customerId){
        return customerService.getCustomerById(customerId);
    }

    @PostMapping("/customer")
    public ResponseEntity<Object> saveCustomer(@Valid @RequestBody CustomerDTO customerDTO){
        Customer savedCustomer = customerService.saveOrUpdate(customerDTO);
        if(savedCustomer == null){
            return new ResponseEntity<>("Password doesn't matched. " +
                    "\nPlease Check the confirm password and try again", HttpStatus.INTERNAL_SERVER_ERROR);
        } else {
            return new ResponseEntity<>("Created", HttpStatus.CREATED);
        }
    }
    /*
    * Test : Post Request Body JSON

    {
        "firstName":"tushar",
        "middleName":"sharma",
        "lastName":"Sharma",
        "email":"tsu@gmail.com",
        "password":"skjkkkl@12A",
        "confirmPassword":"skjkkkl@12A",
        "contact":"1231222222"
    }

    * */
}
