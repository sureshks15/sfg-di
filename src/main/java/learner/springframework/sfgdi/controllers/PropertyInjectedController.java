package learner.springframework.sfgdi.controllers;

import learner.springframework.sfgdi.service.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String getGreeting(){
        return greetingService.greeting();
    }
}
