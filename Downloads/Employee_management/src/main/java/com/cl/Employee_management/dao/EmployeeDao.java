package com.cl.Employee_management.dao;

import com.cl.Employee_management.dto.Employee;
import com.cl.Employee_management.repositary.EmployeeRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeDao {

    @Autowired
    private EmployeeRepositary employeeRepositary;

    public Employee saveEmployee(Employee employee){
        return employeeRepositary.save(employee);
    }

    public Employee updateEmployee(Employee employee, int id){

        if(employeeRepositary.findById(id).isEmpty()){
            return null;
        }else{
            employee.setId(id);
            return employeeRepositary.save(employee);
        }

       // return employeeRepositary.save(employee);
    }
    public Optional<Employee> getEmployeeById(int id){
        return employeeRepositary.findById(id);
    }

    public Employee deleteEmployee(Employee employee){
        employeeRepositary.delete(employee);
        return employee;
    }

    public List<Employee> getAllEmployee(){
        return  employeeRepositary.findAll();
    }




}
