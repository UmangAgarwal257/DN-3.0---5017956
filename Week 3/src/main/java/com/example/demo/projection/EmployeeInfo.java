package com.example.demo.projection;

public class EmployeeInfo {
    private String name;
    private String email;

    public EmployeeInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}