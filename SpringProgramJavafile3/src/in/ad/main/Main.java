package in.ad.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ad.beans.Student;
import in.ad.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext contex = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std = (Student) contex.getBean("stdId1");
		std.display();
	}

}
