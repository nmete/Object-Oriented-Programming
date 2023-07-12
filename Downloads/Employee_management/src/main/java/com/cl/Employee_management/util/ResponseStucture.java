package com.cl.Employee_management.util;

import com.cl.Employee_management.dto.Employee;

import java.util.List;

public class ResponseStucture<T> {

    String message;
    int status;
    T t;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
