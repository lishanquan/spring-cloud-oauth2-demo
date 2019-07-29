package com.daniel.servicehi.service;

import com.daniel.servicehi.dao.UserDao;
import com.daniel.servicehi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @Author: Daniel
 * @Date: 2019/7/29 16:12
 */
@Service
public class UserServiceImpl {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    private UserDao userDao;

    public User create(String username, String password) {

        User user=new User();
        user.setUsername(username);
        String hash = encoder.encode(password);
        user.setPassword(hash);
        return userDao.save(user);

    }

}
