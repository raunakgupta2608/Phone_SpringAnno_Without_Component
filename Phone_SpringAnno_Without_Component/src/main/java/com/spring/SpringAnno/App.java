package com.spring.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.phone.MI;
import com.phone.Samsung;
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
       Samsung s = factory.getBean(Samsung.class);
       s.config();
       
       System.out.println();
       
       MI mi = factory.getBean(MI.class); 
       mi.getMI();
    }
}
