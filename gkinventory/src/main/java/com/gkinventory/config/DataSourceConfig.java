package com.gkinventory.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration

public class DataSourceConfig 
{
	@Bean
	public DataSource dataSoruce()
	{
		DriverManagerDataSource driver  = new DriverManagerDataSource();
		driver.setDriverClassName("org.postgresql.Driver");
		driver.setUrl("jdbc:postgresql://localhost:5432/gkinventorymgt");
		driver.setUsername("gkinventory");
		driver.setPassword("gkinventory");
		
		return driver;
	}
}
