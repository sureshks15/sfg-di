package learner.springframework.sfgdi.controllers;

import learner.springframework.sfgdi.service.GreetingService;
import learner.springframework.sfgdi.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;
    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        GreetingService greetingService = new GreetingServiceImpl();
        propertyInjectedController.greetingService = greetingService;
    }

    @Test
    void getGreeting() {
        System.out.println(propertyInjectedController.getGreeting());
    }
}