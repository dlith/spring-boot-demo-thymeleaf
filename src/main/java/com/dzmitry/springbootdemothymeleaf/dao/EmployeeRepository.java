package com.dzmitry.springbootdemothymeleaf.dao;

import com.dzmitry.springbootdemothymeleaf.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
