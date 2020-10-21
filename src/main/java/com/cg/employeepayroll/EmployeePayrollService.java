package com.cg.employeepayroll;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {

    public ArrayList<EmployeeDetails> employeeDetailsArrayList=new ArrayList<EmployeeDetails>();

    public void readEmployeeDetailsFromConsole(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the employee id");
        String empID=scanner.nextLine();
        System.out.println("enter the employee name");
        String empName=scanner.nextLine();
        System.out.println("enter the salary");
        Long salary=scanner.nextLong();
        EmployeeDetails employeeDetails=new EmployeeDetails();
        employeeDetails.addEmployeeDetails(empID,empName,salary);
        employeeDetailsArrayList.add(employeeDetails);

    }
    public void writeEmployeeDetailsToConsole(){
        System.out.println("Employee Details are written to the console\n"+employeeDetailsArrayList.toString());
    }
     public static void main(String[] args) {
         System.out.println("Welcome to employee payroll service");
         EmployeePayrollService employeePayrollService=new EmployeePayrollService();
         employeePayrollService.readEmployeeDetailsFromConsole();
         employeePayrollService.writeEmployeeDetailsToConsole();


     }

}

