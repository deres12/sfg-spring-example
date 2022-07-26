package deres12.springframework.sfgspringexample.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "PrimaryGreeting Hello World";
    }
}
