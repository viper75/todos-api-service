package org.viper75.todosapiservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.viper75.todosapiservice.models.ApiResponse;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(InvalidArgumentsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiResponse handleInvalidArgumentsException(InvalidArgumentsException iae) {
        return ApiResponse.builder()
                .status(false)
                .message(iae.getMessage())
                .build();
    }
}
