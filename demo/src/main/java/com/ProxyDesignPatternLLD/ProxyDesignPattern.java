package com.ProxyDesignPatternLLD;

public class ProxyDesignPattern {
    public static void main(String[] args) {
        try {
            EmployeeTable empTableObj = new EmployeeTableProxy();
            empTableObj.create("Admin", new EmployeeTableImp());
            System.out.println("Operation Successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
