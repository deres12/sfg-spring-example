package deres12.springframework.sfgspringexample.controllers;

import deres12.springframework.sfgspringexample.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Autowired
    @Qualifier("setterGreetingServiceImpl")//CLASS NAME BUT LOWER CASE FIRST CHARACTER
    public void setGreetingService(GreetingService greetingService){ this.greetingService = greetingService; }

    public String getGreeting() { return greetingService.sayGreeting(); }

}
