package deres12.springframework.sfgspringexample.controllers;

import deres12.springframework.sfgspringexample.services.GreetingServiceImplNoAnnotation;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingServiceImplNoAnnotation greetingService;

    public ConstructorInjectedController (GreetingServiceImplNoAnnotation greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
