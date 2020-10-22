package com.cg.employeepayroll;

public class EmployeeDetails {

    private String employeeID;
    private String employeeName;
    private Long Salary;

    public void addEmployeeDetails(String employeeID, String employeeName, Long Salary) {
        this.employeeID = employeeID;
        this.employeeName=employeeName;
        this.Salary=Salary;
    }

    @Override
    public String toString() {
        return employeeID+" "+employeeName+" "+Salary;
    }

}
