package com.cg.employeepayroll;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeePayrollServiceIOTest {
    @Test
    public void givenEmployeDetailsObjectAddItToFile() {
        EmployeePayrollService employeePayrollService=new EmployeePayrollService();
        employeePayrollService.addDetailsToEmployeeList("1","jeff", (long) 40000);
        employeePayrollService.addDetailsToEmployeeList("1","elon", (long) 50000);
        employeePayrollService.addDetailsToEmployeeList("1","mark", (long) 30000);

       employeePayrollService.writeEmployeeDetailsTOFile();

        Assert.assertEquals(3,employeePayrollService.getCount());
    }
}