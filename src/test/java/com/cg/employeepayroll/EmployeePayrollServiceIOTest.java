package com.cg.employeepayroll;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeePayrollServiceIOTest {
    EmployeePayrollService employeePayrollService=new EmployeePayrollService();
    @Before
    public void setUp() throws Exception {
        employeePayrollService.addDetailsToEmployeeList("1","jeff", (long) 40000);
        employeePayrollService.addDetailsToEmployeeList("1","elon", (long) 50000);
        employeePayrollService.addDetailsToEmployeeList("1","mark", (long) 30000);
    }

    @Test
    public void givenEmployeDetailsObjectAddItToFile() {

       employeePayrollService.writeEmployeeDetailsTOFile();

        Assert.assertEquals(3,employeePayrollService.getCount());
    }

    @Test
    public void whenGivenFilePrintContent() {

        employeePayrollService.writeEmployeeDetailsTOFile();
        Assert.assertEquals(3,employeePayrollService.readEmployeeDetailsFromFile());
    }
}