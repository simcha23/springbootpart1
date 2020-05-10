package com.springboot.springbootpart1;

import com.springboot.springbootpart1.controller.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Springbootpart1Application{

	public static void main(String[] args) {
		SpringApplication.run(Springbootpart1Application.class, args);
	}

//	@Autowired
//	UserServiceImpl array;

	@Bean
	public void demo(UserServiceImpl userService) {
		userService.addUser("SImcar","Mahlangu");
	}
//	@Override
//	public void run(String... args) throws Exception {
//
//		UserServiceImpl userService = new UserServiceImpl();
//		userService.addUser("Simcar", "Mahlangu");
//	}
}

