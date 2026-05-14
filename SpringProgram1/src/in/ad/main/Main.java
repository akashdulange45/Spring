package in.ad.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ad.beans.Student;

public class Main {
public static void main(String[] args) {
	
	String config_location ="/in/ad/resources/applicationContext.xml";
	ApplicationContext context = new ClassPathXmlApplicationContext(config_location);

    Student std =(Student) context.getBean("stdId");
    
    std.disply();
    
    System.out.println("-------------------------------");
    
 Student std1 =(Student) context.getBean("stdId1");
    
    std1.disply();
}
}
