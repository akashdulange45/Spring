package in.ad.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ad.beans.Employee;

public class Main {
	public static void main(String[] args) {
		
		String Class_path = "/in/ad/resources/ApplicationConfig.xml";
		ApplicationContext contex = new ClassPathXmlApplicationContext(Class_path);
	
		Employee emp = (Employee) contex.getBean("employee");
		emp.display();
	
	}
}
