package com.p.cosmetics.service;

import com.p.cosmetics.pojo.User;

public interface UserService {
    User find(String id);
    void delete(String id);
    void add(User user);
    void modify(String id,User user);
}
