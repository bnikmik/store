package com.example.store.exception.handlers;

import com.example.store.exception.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionsControllerAdvice {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<?> notFound() {
        return ResponseEntity.status(404).build();
    }

}
