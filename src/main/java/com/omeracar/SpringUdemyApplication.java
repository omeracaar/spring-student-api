package com.omeracar;

import com.omeracar.configuration.GlobalProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource(value = "classpath:application.properties")
@EnableConfigurationProperties(value = GlobalProperties.class)
public class SpringUdemyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringUdemyApplication.class, args);
	}

}
