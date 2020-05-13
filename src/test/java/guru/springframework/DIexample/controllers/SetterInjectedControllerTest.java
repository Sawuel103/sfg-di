package guru.springframework.DIexample.controllers;

import guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}