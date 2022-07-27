package deres12.springframework.sfgspringexample.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    public LifeCycleDemoBean() {
        System.out.println("### LifeCycleDemoBean Constructor ");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("### setBeanFactory: beanFactory==>" + beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("### setBeanName: s==>" + s);
    }

    @Override
    public void destroy(){
        System.out.println("### destroy: ");
    }

    @Override
    public void afterPropertiesSet()  {
        System.out.println("### afterPropertiesSet: ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("### setApplicationContext: applicationContext==>" + applicationContext);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("### LifeCycleDemoBean postConstructor ");
    }

    @PreDestroy
    public void PreDestroy() {
        System.out.println("### LifeCycleDemoBean PreDestroy ");
    }

    public void beforeInit() {
        System.out.println("### LifeCycleDemoBean beforeInit ");
    }

    public void afterInit() {
        System.out.println("### LifeCycleDemoBean afterInit ");
    }
}
