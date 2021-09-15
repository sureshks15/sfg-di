package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class LifeCycleDemoBean implements ApplicationContextAware, InitializingBean, DisposableBean,
        BeanNameAware, BeanFactoryAware {

    public LifeCycleDemoBean() {
        System.out.println("## Constructor has been called");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean factory is set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## My Bean name is: "+name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The lifecycle bean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleBean has its properties set! ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## The post construct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## The Pre Destroy annotated method has been called");
    }

    public void beforeInit(){
        System.out.println("## LifeCycleDemoBean before Init method is called.");
    }

    public void afterInit(){
        System.out.println("## LifeCycleDemoBean afterInit method is called.");
    }
}
