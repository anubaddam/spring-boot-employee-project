package com.example.jan2023.service;

import com.example.jan2023.model.Employee;
import com.example.jan2023.repository.EmployeeRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

    @InjectMocks
    EmployeeService employeeService;

    @Mock
    EmployeeRepository employeeRepository;

    public static List<Employee> employeeList = new ArrayList<>();

    @Before
    public void doSetup(){
        Employee employeeOne = new Employee();
        employeeOne.setEmpno(1);
        employeeOne.setEname("TESTONE");
        employeeOne.setJob("SALESMAN");

        Employee employeeTwo = new Employee();
        employeeTwo.setEmpno(2);
        employeeTwo.setEname("TESTTWO");
        employeeTwo.setJob("Manager");

        employeeList.add(employeeOne);
        employeeList.add(employeeTwo);

    }

    @Test
    public void testGetAllEmployee() {

        when(employeeRepository.findAll()).thenReturn(employeeList);

        List<Employee> actualEmployeeList = employeeRepository.findAll();

        assertNotNull(actualEmployeeList);
        assertEquals(actualEmployeeList.size(), employeeList.size());
    }
}