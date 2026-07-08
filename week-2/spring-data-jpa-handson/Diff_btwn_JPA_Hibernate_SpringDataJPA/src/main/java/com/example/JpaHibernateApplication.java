package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@SpringBootApplication
public class JpaHibernateApplication implements CommandLineRunner {

    @Autowired
    EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(JpaHibernateApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Employee employee = new Employee("John", 50000);
        employeeService.addEmployee(employee);
        System.out.println("Employee Added Successfully");
    }
}
