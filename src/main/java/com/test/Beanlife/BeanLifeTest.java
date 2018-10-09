package com.test.Beanlife;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext( "applicationContext.xml" );
        JuiceMaker juiceMaker = (JuiceMaker) ctx.getBean( "juiceMaker" );
        System.out.println( juiceMaker.makeJuice() );
        ctx.close();
    }
}
