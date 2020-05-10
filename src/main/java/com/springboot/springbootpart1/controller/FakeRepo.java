package com.springboot.springbootpart1.controller;

import com.springboot.springbootpart1.FakeRepoInterface;
import com.springboot.springbootpart1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class FakeRepo implements FakeRepoInterface {

    @Autowired
    User array;

    @Override
    public Object insertUser(long id, String name, String surname) {

        array.setId(id);
        array.setName(name);
        array.setSurname(surname);
        return array.getName() + array.getSurname();
    }

    @Override
    public Optional findUserById(long id) {
        return Optional.empty();
    }

    @Override
    public String deleteUser(long id) {
        return null;
    }
}
