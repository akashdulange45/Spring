package in.ad.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ad.beans.Address;
import in.ad.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createadd() {
		Address addr = new Address();
		
		addr.setHouseno(1123);
		addr.setCity("Tuljapur");
		addr.setPincode(413601);
		
		
		return addr;
	}
	
	@Bean
	public Student createstd() {
		Student std = new Student();
		std.setName("Akash");
		std.setRollno(11);
	//	std.setAddress(createadd());    //manually Dependecy Injected
		
		
		return std;
	}

}
