package guru.springframework.DIexample.controllers;

import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();


    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}