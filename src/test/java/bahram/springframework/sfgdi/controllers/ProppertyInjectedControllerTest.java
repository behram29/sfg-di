package bahram.springframework.sfgdi.controllers;

import bahram.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProppertyInjectedControllerTest {

    ProppertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ProppertyInjectedController();

        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}