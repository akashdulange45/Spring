package in.ad.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ad.beans.Student;

public class Main {
	public static void main(String[] args) {
		
		String configFile = "/in/ad/resources/ApplicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
		
		Student std =(Student) context.getBean("stdId");
		std.display();
	}

}
