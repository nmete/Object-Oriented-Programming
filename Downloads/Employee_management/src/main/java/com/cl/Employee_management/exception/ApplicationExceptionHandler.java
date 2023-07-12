package com.cl.Employee_management.exception;

import com.cl.Employee_management.util.ResponseStucture;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(IdNotFoundException.class)
    public ResponseEntity<ResponseStucture<String>> idNoFoundException(IdNotFoundException exception){
        ResponseStucture<String> responseStucture= new ResponseStucture<>();
        responseStucture.setMessage("Id Not Found in database");
        responseStucture.setStatus(HttpStatus.NOT_FOUND.value());
        responseStucture.setT("No Such Id Found");

        return new ResponseEntity<>(responseStucture,HttpStatus.NOT_FOUND);
    }
}
