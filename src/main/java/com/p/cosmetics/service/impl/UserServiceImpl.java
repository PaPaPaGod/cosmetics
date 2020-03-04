package com.p.cosmetics.service.impl;

import com.p.cosmetics.dao.UserDao;
import com.p.cosmetics.pojo.User;
import com.p.cosmetics.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public User find(String id) {
        User user = userDao.find(id);
        return user;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void add(User user) {

    }

    @Override
    public void modify(String id, User user) {

    }
}
