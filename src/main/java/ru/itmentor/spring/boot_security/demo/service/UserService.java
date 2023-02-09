package ru.itmentor.spring.boot_security.demo.service;

import ru.itmentor.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsersList();

    void deleteUser(Long id);

    void saveUser(User user, Long[] roles);

    User findById(Long id);
}
