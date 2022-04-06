package com.parul.bootcamp.project.controller;

import com.parul.bootcamp.project.dto.CustomerDTO;
import com.parul.bootcamp.project.dto.SellerDTO;
import com.parul.bootcamp.project.entities.Customer;
import com.parul.bootcamp.project.entities.Seller;
import com.parul.bootcamp.project.exceptions.BadRequestException;
import com.parul.bootcamp.project.service.CustomerService;
import com.parul.bootcamp.project.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class SellerController {
    @Autowired
    SellerService sellerService;

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity handleException(BadRequestException e) {
       return new ResponseEntity(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity methodArgumentNotValidException(MethodArgumentNotValidException e) {
        BindingResult result = e.getBindingResult();
        List<FieldError> fieldErrors = result.getFieldErrors();
        String validationErrList="";
        for (FieldError fieldError: fieldErrors) {
            validationErrList += fieldError.getDefaultMessage()+"\n";
        }
        return new ResponseEntity(validationErrList,
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("/register-seller")
    public ResponseEntity registerSeller(@Valid @RequestBody SellerDTO sellerDTO){
         Seller seller = sellerService.registerSeller(sellerDTO);
         if(seller==null){
             return new ResponseEntity("Error occured",
                     HttpStatus.INTERNAL_SERVER_ERROR);
         }
         return new ResponseEntity("Seller Registered Successfully",
                 HttpStatus.CREATED);
    }

}
