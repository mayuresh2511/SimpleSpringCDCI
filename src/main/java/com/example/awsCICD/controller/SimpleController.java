package com.example.awsCICD.controller;

import com.example.awsCICD.dto.Employee;
import com.example.awsCICD.service.SimpleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SimpleController {

    private final SimpleService simpleService;

    public SimpleController(SimpleService simpleService){
        this.simpleService = simpleService;
    }
    @GetMapping("/getEmployee/{id}")
    public Employee getEmployee(@PathVariable int id){
        return simpleService.getEmployee(id);
    }
    @GetMapping("/getAllEmployees")
    public List<Employee> getEmployees(){
        return simpleService.getEmployeeList();
    }
    @PostMapping("/addEmployee")
    public String addEmployee (@RequestBody Employee employee){
        return simpleService.addEmployee(employee);
    }
}
