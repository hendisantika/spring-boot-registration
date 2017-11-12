package com.hendisantika.registrationlogindemo.service;


import com.hendisantika.registrationlogindemo.model.User;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-registration
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/11/17
 * Time: 09.35
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
