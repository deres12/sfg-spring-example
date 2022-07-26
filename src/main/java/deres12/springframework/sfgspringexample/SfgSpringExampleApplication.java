package deres12.springframework.sfgspringexample;

import deres12.springframework.sfgspringexample.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgSpringExampleApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgSpringExampleApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");
        String example = myController.sayHello();
        System.out.println(example);
    }

}
