package com.cl.Employee_management.service;

import com.cl.Employee_management.dao.EmployeeDao;
import com.cl.Employee_management.dto.Employee;
import com.cl.Employee_management.exception.IdNotFoundException;
import com.cl.Employee_management.util.ResponseStucture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    void setGrade(Employee employee){
        if(employee.getSalary() > 10000){
            employee.setGrade("A");
        }else{
            employee.setGrade("B");
        }
    }
    public ResponseEntity<ResponseStucture<Employee>> saveEmployee(Employee employee){

        setGrade(employee);

        ResponseStucture<Employee> responseStucture= new ResponseStucture<>();
        responseStucture.setMessage("Employee saved successfully");
        responseStucture.setStatus(HttpStatus.CREATED.value());
        responseStucture.setT(employee);
        return new ResponseEntity<ResponseStucture<Employee>>(responseStucture, HttpStatusCode.valueOf(HttpStatus.CREATED.value()));
    }


    public ResponseEntity<ResponseStucture<Employee>>  updateEmployee( Employee employee, int id){

       setGrade(employee);

       Employee employee1 = employeeDao.updateEmployee(employee, id);
       ResponseStucture<Employee> responseStucture= new ResponseStucture<>();


        if(employee1 != null){
            responseStucture.setT(employee1);
            responseStucture.setMessage("Employee updated successfully");
            responseStucture.setStatus(HttpStatus.OK.value());
            return new ResponseEntity<ResponseStucture<Employee>>(responseStucture, HttpStatusCode.valueOf(HttpStatus.OK.value()));

        }else{
            responseStucture.setMessage("Invalid Id");
            responseStucture.setStatus(HttpStatus.NOT_FOUND.value());
            responseStucture.setT(null);
            return new ResponseEntity<ResponseStucture<Employee>>(responseStucture, HttpStatusCode.valueOf(HttpStatus.NOT_FOUND.value()));
        }

    }


    public ResponseEntity<ResponseStucture<Employee>> deleteEmployee(int id){

        Optional<Employee> emp= employeeDao.getEmployeeById(id);
        ResponseStucture<Employee> responseStucture= new ResponseStucture<>();

        if(emp != null){

            Employee employee= emp.get();
            employeeDao.deleteEmployee(employee);
            responseStucture.setMessage("Employee deleted successfully");
            responseStucture.setStatus(HttpStatus.OK.value());
            responseStucture.setT(employee);
            return new ResponseEntity<ResponseStucture<Employee>>(responseStucture, HttpStatusCode.valueOf(HttpStatus.OK.value()));
        }else
        {
            responseStucture.setMessage("Invalid Id");
            responseStucture.setStatus(HttpStatus.NOT_FOUND.value());
            responseStucture.setT(null);
            return new ResponseEntity<ResponseStucture<Employee>>(responseStucture, HttpStatusCode.valueOf(HttpStatus.NOT_FOUND.value()));
        }


    }


    public ResponseEntity<ResponseStucture<List<Employee>>> findAllEmployee(){

        ResponseStucture<List<Employee>> responseStucture= new ResponseStucture<List<Employee>>();
        responseStucture.setMessage("Employee list found successfully");
        responseStucture.setStatus(HttpStatus.OK.value());
        responseStucture.setT(employeeDao.getAllEmployee());
        return new ResponseEntity<ResponseStucture<List<Employee>>>(responseStucture,HttpStatus.OK);
    }


    public ResponseEntity<ResponseStucture<Employee>> getEmployee(int id){

        Optional<Employee> emp= employeeDao.getEmployeeById(id);
        ResponseStucture<Employee> responseStucture= new ResponseStucture<>();

        if(emp.isEmpty()){
            throw new IdNotFoundException();
        }else{
            responseStucture.setMessage("Employee found");
            responseStucture.setStatus(HttpStatus.OK.value());
            responseStucture.setT(emp.get());
            return new ResponseEntity<ResponseStucture<Employee>>(responseStucture, HttpStatus.OK);
        }
    }
}
