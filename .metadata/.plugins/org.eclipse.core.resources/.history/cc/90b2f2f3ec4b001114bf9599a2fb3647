package in.ad.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ad.beans.Address;
import in.ad.beans.Student;

@Configuration
public class SpringConfigfile {
	
	@Bean
public Address createadd() {
	Address addr = new Address();
	
	addr.setHouseno(000111);
	addr.setCity("Mumbai");
	addr.setPincode(1234567);
	
	return addr;
}
	
	@Bean
public Student createstd() {
	Student std1 = new Student();
	
	std1.setRollno(215);
	std1.setName("Abhishekh");
	std1.setAddress(createadd());
	
	return std1;
}
	
	
}
