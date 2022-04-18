package com.parul.bootcamp.project.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity handleConfirmPwdNotMatchException(BadRequestException e) {
        return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity handleValidationsException(MethodArgumentNotValidException e) {
        BindingResult result = e.getBindingResult();
        List<FieldError> fieldErrors = result.getFieldErrors();
        String validationErrList = "";
        for (org.springframework.validation.FieldError fieldError : fieldErrors) {
            validationErrList += fieldError.getDefaultMessage() + "\n";
        }
        return new ResponseEntity(validationErrList,
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity handleAlreadyExistsException(SQLIntegrityConstraintViolationException e) {
        String errMsg = "";
        if (e.getMessage().contains("Duplicate")) {
            errMsg = "User Already Exists";
        }
        return new ResponseEntity(errMsg, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
