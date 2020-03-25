package bahram.springframework.sfgdi.controllers;

import bahram.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProppertyInjectedControllerTest {

    ProppertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ProppertyInjectedController();

        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}