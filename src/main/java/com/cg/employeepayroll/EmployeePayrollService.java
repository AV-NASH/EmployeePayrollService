package com.cg.employeepayroll;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {

    public ArrayList<EmployeeDetails> employeeDetailsArrayList=new ArrayList<EmployeeDetails>();
    long count=0;

    public void addDetailsToEmployeeList(String empID,String empName,Long Salary){
        EmployeeDetails employeeDetails=new EmployeeDetails();
        employeeDetails.addEmployeeDetails(empID,empName,Salary);
        employeeDetailsArrayList.add(employeeDetails);

    }

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

    public void writeEmployeeDetailsTOFile(){
        EmployeePayrollServiceIO employeePayrollServiceIO=new EmployeePayrollServiceIO();
        employeePayrollServiceIO.writeEmployeePayrollToFile(employeeDetailsArrayList);
        count=employeePayrollServiceIO.countEntires();
    }

    public long readEmployeeDetailsFromFile(){
        EmployeePayrollServiceIO employeePayrollServiceIO=new EmployeePayrollServiceIO();
        return  employeePayrollServiceIO.readEmployeePayrollFromFile();

    }

    public long getCount(){
        return  count;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to employee payroll service");
        EmployeePayrollService employeePayrollService=new EmployeePayrollService();
        employeePayrollService.readEmployeeDetailsFromConsole();
        employeePayrollService.writeEmployeeDetailsToConsole();

    }

}
