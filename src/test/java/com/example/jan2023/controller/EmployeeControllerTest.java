package com.example.jan2023.controller;

import com.example.jan2023.model.Employee;
import com.example.jan2023.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

//@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {

    @InjectMocks
    EmployeeController employeeController;

    @Mock
    EmployeeService employeeService;

    @Test
    public void testGetAllEmployee(){

        Employee employeeOne = new Employee();
        employeeOne.setEmpno(1);
        employeeOne.setEname("TESTONE");
        employeeOne.setJob("SALESMAN");

        Employee employeeTwo = new Employee();
        employeeTwo.setEmpno(2);
        employeeTwo.setEname("TESTTWO");
        employeeTwo.setJob("Manager");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employeeOne);
        employeeList.add(employeeTwo);

        when(employeeService.getAllEmployee()).thenReturn(employeeList);

        List<Employee> actualEmployeeList = employeeController.getAllEmployee();

        assertNotNull(actualEmployeeList, "received empty list");
        assertEquals(employeeList.size(), actualEmployeeList.size());
        assertEquals(employeeList, actualEmployeeList);

    }
}
