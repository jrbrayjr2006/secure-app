package com.jaydot2.security.secureapp;


import com.jaydot2.security.secureapp.config.SecurityConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration( classes = SecurityConfig.class )
@SpringBootTest
public class SecureAppApplicationTests {

	@Test
	public void contextLoads() {
	}

}
