package com.ProxyDesignPatternLLD;

public class EmployeeTableImp extends EmployeeTable {
    @Override
    public void createEmployee(String client, EmployeeTable obj) {
        System.out.println("Creating Employee: " + obj);
    }

    @Override
    public void deleteEmployee(String name) {
        System.out.println("Deleting Employee: " + name);
    }

    @Override
    public void showEmployeeDetails(String name) {
        System.out.println("Showing details of Employee: " + name);
    }

}
