package in.ad.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public DriverManagerDataSource myDataSource ()
	{
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/Spring_jdbcdb");
		datasource.setUsername("root");
		datasource.setPassword("Akash@1214");
		
		return datasource;
	}
	
	@Bean
	public JdbcTemplate myjdbcTemplete() {
		JdbcTemplate jdbctemplete = new JdbcTemplate();
		jdbctemplete.setDataSource(myDataSource());
		
		return jdbctemplete;
	}

}
