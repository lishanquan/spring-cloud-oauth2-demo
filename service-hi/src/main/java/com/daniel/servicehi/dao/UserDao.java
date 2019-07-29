package com.daniel.servicehi.dao;

import com.daniel.servicehi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Daniel
 * @Date: 2019/7/29 16:11
 */
public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
