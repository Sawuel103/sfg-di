package guru.springframework.DIexample.controllers;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {


    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}