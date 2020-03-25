package bahram.springframework.sfgdi.controllers;

import bahram.springframework.sfgdi.services.GreetingService;

public class ProppertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
