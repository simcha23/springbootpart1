package com.springboot.springbootpart1.controller;

import com.springboot.springbootpart1.dao.FakeRepo;
import com.springboot.springbootpart1.service.UserService;
import com.springboot.springbootpart1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    FakeRepo fakeRepo; // instantiate FakeRepo class

    @Override
    public String addUser(String name, String surname) { //Adds a new user into a database
        User user = fakeRepo.insertUser(fakeRepo.database() + 1,name,surname); //Calls a insertUser method from FakeRepo class
        name = user.getName() + " " + user.getSurname() + " entered"; // Get name and surname from User class

        return name;
    }

    @Override
    public String removeUser(long Id) { //Removes a selected username
        User user = fakeRepo.deleteUser(Id); //Calls a removeUser method from FakeRepo class
        String name = user.getName() + " " + user.getSurname() + " deleted"; // Get name and surname from User class

        return name;
    }

    @Override
    public String getUser(long Id) { //Prints a selected username
        User user = fakeRepo.findUserById(Id); //Calls a getUser method from FakeRepo class
        String name = "Hello " + user.getName() + " " + user.getSurname(); // Get name and surname from User class

        return name;
    }
}
