package com.qf.dao.impl;

import com.qf.dao.UserDao;
import com.qf.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<User> findAll() {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("小明","123"));
        list.add(new User("小智","123"));

        return list;
    }
}
