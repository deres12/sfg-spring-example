package deres12.springframework.sfgspringexample.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImplNoAnnotation implements GreetingServiceNoAnnotation {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
