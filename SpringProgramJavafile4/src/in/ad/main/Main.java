package in.ad.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ad.beans.Employee;
import in.ad.resources.SpringConfig;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Employee emp = (Employee) context.getBean("emp1");
		emp.display();
		
	}

}
