package in.ad.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ad.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Student stdId1() {
          Student std = new Student();
          std.setName("Sachin");
          std.setRollno(101);
          std.setEmail("sachin@gmail.com");
          return std;
	}

}
