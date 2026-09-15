package com.devops.demo.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerTest {

    private final HelloController helloController = new HelloController();

    @Test
    void hello_shouldReturnExpectedMessage(){
        String message = helloController.hello();

        assertEquals("Hello from devops-demo! Version 2", message);
    }


}
