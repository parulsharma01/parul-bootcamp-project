package com.parul.bootcamp.project.controller;

import com.parul.bootcamp.project.dto.CustomerDTO;
import com.parul.bootcamp.project.dto.SellerDTO;
import com.parul.bootcamp.project.entities.Seller;
import com.parul.bootcamp.project.entities.Token;
import com.parul.bootcamp.project.entities.User;
import com.parul.bootcamp.project.exceptions.BadRequestException;
import com.parul.bootcamp.project.service.CustomerService;
import com.parul.bootcamp.project.service.SellerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;


@RestController
public class RegisterController {

    @Autowired
    CustomerService customerService;

    @Autowired
    SellerService sellerService;

    @Autowired
    ModelMapper modelMapper;


    @PostMapping("/register-customer")
    public ResponseEntity<Object> registerCustomer(@Valid @RequestBody CustomerDTO customerDTO) {
        customerService.registerCustomer(customerDTO);
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }

    @PostMapping("/register-seller")
    public ResponseEntity registerSeller(@Valid @RequestBody SellerDTO sellerDTO) {
        Seller seller = sellerService.registerSeller(sellerDTO);
        if (seller == null) {
            return new ResponseEntity("Error occured",
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity("Seller Registered Successfully",
                HttpStatus.CREATED);
    }

    @PostMapping("/activate-account")
    public ResponseEntity activateCustomerByToken(@Valid @RequestBody Token tokenDTO) {
        Token token = modelMapper.map(tokenDTO, Token.class);
        User user = customerService.activateUserByToken(token);
        if (user == null) {
            return new ResponseEntity("Could not Activate Account.",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity("Account Activated Successfully",
                HttpStatus.CREATED);
    }
}
