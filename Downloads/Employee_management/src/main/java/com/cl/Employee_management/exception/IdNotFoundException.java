package com.cl.Employee_management.exception;

public class IdNotFoundException extends RuntimeException{

    String message= "Id Not found";

    @Override
    public String getMessage() {
        return message;
    }
}
