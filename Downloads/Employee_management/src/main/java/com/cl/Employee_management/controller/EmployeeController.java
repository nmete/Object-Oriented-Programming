package com.cl.Employee_management.controller;

import com.cl.Employee_management.dao.EmployeeDao;
import com.cl.Employee_management.dto.Employee;
import com.cl.Employee_management.service.EmployeeService;
import com.cl.Employee_management.util.ResponseStucture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<ResponseStucture<Employee>> saveEmployee(@RequestBody Employee employee){
          return employeeService.saveEmployee(employee);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseStucture<Employee>>  updateEmployee(@RequestBody Employee employee, @RequestParam int id){
        return employeeService.updateEmployee(employee, id);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseStucture<Employee>> deleteEmployee(@RequestParam int id){
        return employeeService.deleteEmployee(id);
    }

    @GetMapping("/findall")
    public ResponseEntity<ResponseStucture<List<Employee>>>  findAllEmployee(){
        return employeeService.findAllEmployee();
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<ResponseStucture<Employee>>  getEmployee(@PathVariable int id){
        return employeeService.getEmployee(id);
    }
}
