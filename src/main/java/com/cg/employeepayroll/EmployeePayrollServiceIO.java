package com.cg.employeepayroll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class EmployeePayrollServiceIO {

    public void writeEmployeePayrollToFile(ArrayList<EmployeeDetails> employeeDetailsArrayList){
        StringBuffer writetofile=new StringBuffer();
        for(EmployeeDetails employeeDetails:employeeDetailsArrayList){
            writetofile.append(employeeDetails.toString().concat("\n"));
        }
        Path path= Paths.get("C:\\Users\\Avinash\\IdeaProjects\\EmployeePayrollService\\src\\main\\java\\com\\cg\\employeepayroll\\Sample.txt");
        try {
            Files.write(path,writetofile.toString().getBytes());
        } catch (IOException e) {
        }

    }

    public long countEntires(){
        Path path=Paths.get("C:\\Users\\Avinash\\IdeaProjects\\EmployeePayrollService\\src\\main\\java\\com\\cg\\employeepayroll\\Sample.txt");
        long entries=0;
        try {
            entries=Files.lines(path).count();
        } catch (IOException e) {
        }
        return  entries;
    }


}
