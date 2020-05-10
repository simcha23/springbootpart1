package com.springboot.springbootpart1;

import java.util.Optional;

public interface FakeRepoInterface<T> {

    Object insertUser(long id, String name, String surname);

    Optional<T> findUserById(long id);

    String deleteUser(long id);


}
