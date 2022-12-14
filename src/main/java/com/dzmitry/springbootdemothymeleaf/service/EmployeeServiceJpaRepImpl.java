package com.dzmitry.springbootdemothymeleaf.service;


import com.dzmitry.springbootdemothymeleaf.dao.EmployeeRepository;
import com.dzmitry.springbootdemothymeleaf.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceJpaRepImpl implements EmployeeService{

    public EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceJpaRepImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public Optional<Employee> findById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}
