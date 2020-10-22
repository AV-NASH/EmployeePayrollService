package com.cg.employeepayroll;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class FileNIOTest {
    @Test
    public void whenGivenPathCHeckFileExistsOrNot() throws IOException {
        Path path= Paths.get("C:\\Users\\Avinash\\IdeaProjects\\EmployeePayrollService\\src\\main\\java\\com\\cg\\employeepayroll\\Sample.txt");
        Assert.assertTrue(Files.exists(path));
        Assert.assertTrue(Files.exists(path));

    }

    @Test
    public void whenGivenFileDeleteAndCHeckNotExist() throws IOException {
        Path path= Paths.get("C:\\Users\\Avinash\\IdeaProjects\\EmployeePayrollService\\src\\main\\java\\com\\cg\\employeepayroll\\delete.txt");
        if(Files.exists(path)) Files.delete(path);
        Assert.assertTrue(Files.notExists(path));
    }

    @Test
    public void whenGivenPathCreateDirectory() throws IOException {
        Path path= Paths.get("C:\\Users\\Avinash\\IdeaProjects\\EmployeePayrollService\\src\\main\\java\\com\\cg\\employeepayroll\\NewFolder");
        Files.createDirectory(path);
        Assert.assertTrue(Files.exists(path));
    }

    @Test
    public void whenGivenEmptyPathCreateFile() throws IOException {
        Path path= Paths.get("C:\\Users\\Avinash\\IdeaProjects\\EmployeePayrollService\\src\\main\\java\\com\\cg\\employeepayroll\\NewFolder\\newcheck.txt");
        try {
            Files.createFile(path);
        } catch (IOException e) {
        }
        Assert.assertTrue(Files.exists(path));
        Files.list(Paths.get("C:\\Users\\Avinash\\IdeaProjects\\EmployeePayrollService\\src\\main\\java\\com\\cg\\employeepayroll\\NewFolder")).forEach(System.out::println);
        Files.newDirectoryStream(Paths.get("C:\\Users\\Avinash\\IdeaProjects\\EmployeePayrollService\\src\\main\\java\\com\\cg\\employeepayroll\\NewFolder")).forEach(System.out::println);
        Files.newDirectoryStream(Paths.get("C:\\Users\\Avinash\\IdeaProjects\\EmployeePayrollService\\src\\main\\java\\com\\cg\\employeepayroll\\NewFolder"),p->p.toFile().isFile()&&p.toString().startsWith("new")).forEach(System.out::println);




    }


}