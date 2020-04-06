package com.hendisantika.registrationlogindemo.repository;

import com.hendisantika.registrationlogindemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-registration
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/11/17
 * Time: 09.31
 * To change this template use File | Settings | File Templates.
 */
public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername(String username);
}
