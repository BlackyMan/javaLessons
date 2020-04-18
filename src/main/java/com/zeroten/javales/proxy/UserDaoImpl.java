package com.zeroten.javales.proxy;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean save(User user) {
        System.out.println("保存用户：" + user.getName() + "，年龄：" + user.getAge());
        return true;
    }

    @Override
    public List query() {
        return null;
    }

    @Override
    public boolean delete() {
        System.out.println("执行删除");
        return true;
    }
}
