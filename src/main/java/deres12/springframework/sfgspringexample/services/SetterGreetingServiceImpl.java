package deres12.springframework.sfgspringexample.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "SetterGreeting Hello World";
    }
}
