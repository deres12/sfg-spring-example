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

        System.out.println("--------- Primary Bean");
        System.out.println(myController.sayHello());

        System.out.println("--------- Property");
        //CLASS NAME CONTROLLER BUT LOWER CASE FIRST CHARACTER
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("--------- Setter");
        //CLASS NAME CONTROLLER BUT LOWER CASE FIRST CHARACTER
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("--------- Constructor");
        //CLASS NAME CONTROLLER BUT LOWER CASE FIRST CHARACTER
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

    }

}
