package com.example.awsCICD.service;

import com.example.awsCICD.dto.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SimpleService {

    private List<Employee> employeeList;

    public List<Employee> getEmployeeList(){
        return employeeList == null ? new ArrayList<>() : employeeList;
    }

    public Employee getEmployee(int id){
        if (employeeList == null || employeeList.isEmpty()) return null;

        List<Employee> employeeFound = employeeList.stream()
                .filter(employee -> employee.getId() == id)
                .toList();
        return employeeFound.get(0);
    }

    public String addEmployee(Employee employee){
        if (employeeList == null) employeeList = new ArrayList<>();

        employeeList.add(employee);
        return "Employee added successfully";
    }
}
