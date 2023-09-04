package com.example.api_integration.exception;

import lombok.Getter;
import org.springframework.http.HttpStatusCode;

@Getter
public class InvalidRequestException extends RuntimeException{

    private HttpStatusCode code;

    public InvalidRequestException(String message,HttpStatusCode code){
        super(message);
        this.code=code;
    }
}
