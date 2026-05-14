package in.ad.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ad.beans.Address;
import in.ad.beans.Student;

@Configuration
public class SpringConfigfile {
	
	@Bean
public Address createadd() {
	Address addr = new Address(200,"Patna",2113);
	
	return addr;
}
	
	@Bean
public Student createstd() {
	Student std1 = new Student(102,"Avinash",createadd());
	return std1;
}
	
	
}
