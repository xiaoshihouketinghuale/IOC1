package com.test.Beanlife;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@Getter
@Setter
public class JuiceMaker implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean {

    private String beverageShop = null;
    private Source source = null;

    public  void init(){
        System.out.println("["+this.getClass().getSimpleName()+"]执行自定义初始化");
    }
    public void destroy(){
        System.out.println("["+this.getClass().getSimpleName()+"]执行自定义销毁方法");
    }
    public String makeJuice(){
        String juice ="这是一杯由"+beverageShop+"饮品，提供的"+source.getSize()+source.getSugar()+source.getFruit();
        return juice;
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("["+this.getClass().getSimpleName()+"]调用接口的setfactory方法");

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("["+this.getClass().getSimpleName()+"]setbeanname方法");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("["+this.getClass().getSimpleName()+"]调用initializingbean接口");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("["+this.getClass().getSimpleName()+"]applicationcontextaware接口"+"的setapplicationcontext方法");

    }
}
