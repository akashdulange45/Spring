package in.ad.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ad.beans.Student;
import in.ad.resources.SpringConfigfile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigfile.class);
		
		Student std = context.getBean(Student.class);
		std.display(); 
	}
	
	

}
