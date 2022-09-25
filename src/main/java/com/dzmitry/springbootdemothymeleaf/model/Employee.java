package com.dzmitry.springbootdemothymeleaf.model;

import lombok.Data;

@Data
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Employee(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
