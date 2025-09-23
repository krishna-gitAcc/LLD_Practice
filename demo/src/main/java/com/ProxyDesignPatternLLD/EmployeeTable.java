package com.ProxyDesignPatternLLD;

public abstract  class EmployeeTable {
    public abstract void createEmployee(String client, EmployeeTable obj);
    public abstract void deleteEmployee(String name);
    public abstract void showEmployeeDetails(String name);
}
