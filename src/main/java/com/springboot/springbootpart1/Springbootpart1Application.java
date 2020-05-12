package com.springboot.springbootpart1;

import com.springboot.springbootpart1.controller.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springbootpart1Application implements CommandLineRunner{

	public static void main(String[] args) {

		SpringApplication.run(Springbootpart1Application.class, args);
	}

	@Autowired
	UserServiceImpl userServiceImpl;
	@Override
	public void run(String... args){

		try {
			System.out.println(userServiceImpl.addUser("Simcar", "Mahlangu")); //Prints added user on a console
			System.out.println(userServiceImpl.getUser(2)); //Prints a selected user on a console
			System.out.println(userServiceImpl.removeUser(3)); //Prints a removed user on a console
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}
}

