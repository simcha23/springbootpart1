package com.springboot.springbootpart1;

public interface UserService {

    void addUser(String name, String surname);

    void removeUser(long Id);

    void getUser(long Id);

}
