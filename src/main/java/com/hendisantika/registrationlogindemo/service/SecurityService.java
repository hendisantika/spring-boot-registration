package com.hendisantika.registrationlogindemo.service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-registration
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/11/17
 * Time: 09.32
 * To change this template use File | Settings | File Templates.
 */
public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
