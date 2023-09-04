package com.example.api_integration.exception;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data

public class ExceptionResponse {
    private String message;
    private Date timestamp;
}
