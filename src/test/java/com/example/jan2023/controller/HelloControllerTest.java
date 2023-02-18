package com.example.jan2023.controller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//@SpringBootTest
public class HelloControllerTest {
    
//    @Autowired
    HelloController helloController = new HelloController();
    
    @Test
    public void testSayHello(){
        String expectedValue = "WELCOME TO THE SPRINGBOOT FRAMEWORK";
        String actualValue = helloController.sayHello();
        
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testSayHelloWithName(){
        String inputName = "TESTNAME";
        String responseString = helloController.sayHelloWithName(inputName);

        assertNotNull(responseString);
        assertThat(responseString.contains(inputName));

    }

    @Test
    public void testSayHelloWithRequestParam(){
        String inputName = "TESTNAME";
        String responseString = helloController.sayHelloWithRequestParam(inputName);

        assertNotNull(responseString);
        assertThat(responseString.contains(inputName));
    }
}
