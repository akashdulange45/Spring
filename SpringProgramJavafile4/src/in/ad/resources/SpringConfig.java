package in.ad.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ad.beans.Employee;

@Configuration
public class SpringConfig {
	
	@Bean
	public Employee emp1() {
		Employee emp = new Employee();
		emp.setEmpName("Akash Dulange");
		emp.setEmpDept("IT");
		emp.setEmpRoll("Software Engineer");
		return emp;
		
	}
  
	
}
