package deres12.springframework.sfgspringexample.controllers;

import deres12.springframework.sfgspringexample.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
