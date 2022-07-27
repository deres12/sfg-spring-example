package deres12.springframework.sfgspringexample.controllers;

import deres12.springframework.sfgspringexample.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyGreetingServiceImpl")//CLASS NAME BUT LOWER CASE FIRST CHARACTER
    private GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
