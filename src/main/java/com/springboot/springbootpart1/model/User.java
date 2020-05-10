package com.springboot.springbootpart1.model;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

//@Entity
public class User {
//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    private long Id;
    private String name;
    private String surname;

    public User(){}

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
