package com.daniel.authservice.dao;

import com.daniel.authservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Daniel
 * @Date: 2019/7/29 10:08
 */
public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
