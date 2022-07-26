package deres12.springframework.sfgspringexample;

import deres12.springframework.sfgspringexample.controllers.ConstructorInjectedController;
import deres12.springframework.sfgspringexample.controllers.MyController;
import deres12.springframework.sfgspringexample.controllers.PropertyInjectedController;
import deres12.springframework.sfgspringexample.controllers.SetterInjectedController;
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

        System.out.println("--------- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("--------- Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("--------- Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

    }

}
