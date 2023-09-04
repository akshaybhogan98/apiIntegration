package com.example.api_integration.exception.handler;


import com.example.api_integration.exception.ExceptionResponse;
import com.example.api_integration.exception.InvalidRequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@Slf4j
@RestControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(InvalidRequestException.class)
    public final ResponseEntity<ExceptionResponse> handleBadHeaderException(InvalidRequestException ex){
        ExceptionResponse exceptionResponse=ExceptionResponse.builder().timestamp(new Date())
                .message(ex.getMessage()).build();
        return new ResponseEntity<>(exceptionResponse, HttpStatus.FORBIDDEN);
    }
}
