package com.brianworks.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.brianworks.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String config = "/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
   
   Student std = context.getBean(Student.class);
   
   std.display();
    
    }
}
