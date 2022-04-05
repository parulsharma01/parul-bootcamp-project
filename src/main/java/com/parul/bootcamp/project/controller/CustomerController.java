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

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity handleException(BadRequestException e) {
       return new ResponseEntity(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity methodArgumentNotValidException(MethodArgumentNotValidException e) {
        BindingResult result = e.getBindingResult();
        List<org.springframework.validation.FieldError> fieldErrors = result.getFieldErrors();
        String validationErrList="";
        for (org.springframework.validation.FieldError fieldError: fieldErrors) {
            validationErrList += fieldError.getDefaultMessage()+"\n";
        }
        return new ResponseEntity(validationErrList,
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    @ResponseBody
    public Customer getCustomerById(@PathParam("id") int customerId){
        return customerService.getCustomerById(customerId);
    }

    @PostMapping("/customer")
    public ResponseEntity<Object> saveCustomer(@Valid @RequestBody CustomerDTO customerDTO){
        customerService.saveOrUpdate(customerDTO);
            return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }
    /*
    * Test : Post Request Body JSON

    {
        "firstName":"tushar",
        "middleName":"sharma",
        "lastName":"Sharma",
        "email":"tsu@gmail.com",
        "password":"Password@123",
        "confirmPassword":"Password@123",
        "contact":"1231222222"
    }

    * */
}
