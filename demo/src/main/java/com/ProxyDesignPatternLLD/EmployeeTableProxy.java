package com.ProxyDesignPatternLLD;

public class EmployeeTableProxy extends EmployeeTable {
    private EmployeeTableImp employeeTableImp;
    private String userRole;

    public EmployeeTableProxy() {
        this.userRole = userRole;
        this.employeeTableImp = new EmployeeTableImp();
    }

    @Override
    public void createEmployee(String name, EmployeeTable permission) {
        if (userRole.equals("ADMIN")) {
            employeeTableImp.createEmployee(name, permission);
        } else {
            System.out.println("Access Denied: Only ADMIN can create employees.");
        }
    }

    @Override
    public void deleteEmployee(String name) {
        if (userRole.equals("ADMIN")) {
            employeeTableImp.deleteEmployee(name);
        } else {
            System.out.println("Access Denied: Only ADMIN can delete employees.");
        }
    }

    @Override
    public void showEmployeeDetails(String name) {
        employeeTableImp.showEmployeeDetails(name);
    }

}
