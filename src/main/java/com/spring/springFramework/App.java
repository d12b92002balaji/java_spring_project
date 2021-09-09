package com.spring.springFramework;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
    	ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
    	car obj =(car)context.getBean("car");
    	obj.drive();
    	/*tyre t=(tyre)context.getBean("tyre");
    	System.out.print(t);*/
    }

}
