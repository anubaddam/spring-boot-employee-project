package com.example.jan2023.controller;

import com.example.jan2023.service.CalculateService;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.*;

//@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class CalculatorControllerTest {

    @InjectMocks
    CalculatorController calculatorController;

    @Mock
    CalculateService calculateService;

    @Test
    public void testAdd(){
        double firstInput = 2.0;
        double secondInput = 3.0;
        when(calculateService.add(firstInput, secondInput)).thenReturn(5.0);
        double actualValue = calculatorController.add(firstInput, secondInput);
        double expectedValue = 5.0;

        Assert.assertTrue(actualValue == expectedValue);
    }

    @Test
    public void testDivide(){
        double firstInput = 10.0;
        double secondInput = 2.0;
        when(calculateService.divide(firstInput, secondInput)).thenReturn(5.0);
        ResponseEntity<Object> responseEntity = calculatorController.divide(firstInput, secondInput);
        HttpStatus httpStatus = responseEntity.getStatusCode();
        String responseBody = responseEntity.getBody().toString();

        Assert.assertTrue(httpStatus.is2xxSuccessful());
        Assert.assertTrue(httpStatus.toString().equals("200 OK"));
        Assert.assertTrue(responseBody.equals("5.0"));
    }


    /*

    @Before
    public void before(){
        System.out.println("before");
    }

    @After
    public void after(){
        System.out.println("after");
    }

    @BeforeClass
    public static void beforeClas(){
        System.out.println("beforeClas");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass");
    }

     */

}
