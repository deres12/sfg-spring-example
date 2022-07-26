package deres12.springframework.sfgspringexample.controllers;

import deres12.springframework.sfgspringexample.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController (GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
