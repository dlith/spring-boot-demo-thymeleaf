package com.dzmitry.springbootdemothymeleaf.controller;

import com.dzmitry.springbootdemothymeleaf.entity.Employee;
import com.dzmitry.springbootdemothymeleaf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    /*private List<Employee> employeeList;

    @PostConstruct
    private void loadData(){
        Employee emp1 = new Employee(1, "Leslie", "Andrews", "lesie@gmail.com");
        Employee emp2 = new Employee(2, "Alex", "Cooler", "alex@gmail.com");
        Employee emp3 = new Employee(3, "Megan", "Mur", "megan@gmail.com");

        employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
    }*/

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model model) {

        List<Employee> employeeList = employeeService.findAll();
        model.addAttribute("employeeList", employeeList);

        return "list-employees";
    }
}
