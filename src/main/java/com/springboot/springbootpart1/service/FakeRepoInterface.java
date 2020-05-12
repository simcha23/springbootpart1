package com.springboot.springbootpart1.service;

import com.springboot.springbootpart1.model.User;

public interface FakeRepoInterface{

    User insertUser(long id, String name, String surname);

    User findUserById(long id);

    User deleteUser(long id);


}
