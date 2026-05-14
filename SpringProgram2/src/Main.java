import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ad.beans.Employee;

public class Main {
public static void main(String[] args) {
	String config = "/in/ad/resources/applicationContext.xml";
	ApplicationContext context = new ClassPathXmlApplicationContext(config);
	
	Employee emp = (Employee) context.getBean("emp1");
	emp.display();
	System.out.println("-----------------------------------");
	
	Employee emp1 = (Employee) context.getBean("emp2");
	emp1.display();
}
}
