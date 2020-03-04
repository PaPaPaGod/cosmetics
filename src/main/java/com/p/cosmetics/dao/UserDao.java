package com.p.cosmetics.dao;

import com.p.cosmetics.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

@Mapper
public interface UserDao {
    User find(String id);
    void delete(String id);
    void add(User user);
    void modify(User usr);
}
