package com.ankit.hotelservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<CustomException> resourceNotFoundHandler(ResourceNotFoundException e){
        CustomException customException = new CustomException();
        customException.setMessage(e.getMessage());
        customException.setHttpStatus(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(customException, HttpStatus.NOT_FOUND);
    }
}
