package com.hexaware.springJdbc.Config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.hexaware.springJdbc"})
@PropertySource("classpath:database.properties")
public class AppConfig {
	
	@Autowired
	Environment env;
	
	@Bean
	public DataSource datasource()
	{
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		
		datasource.setUrl(env.getProperty("url"));
		datasource.setUsername(env.getProperty("uname"));
		datasource.setPassword(env.getProperty("password"));
		
		return datasource;
		
	}

	

}
