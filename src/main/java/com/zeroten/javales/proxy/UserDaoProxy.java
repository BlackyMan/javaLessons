package com.zeroten.javales.proxy;

import java.util.List;

public class UserDaoProxy implements UserDao {
    private UserDao target;

    public UserDaoProxy(UserDao target) {
        this.target = target;
    }

    @Override
    public boolean save(User user) {
        if (user.getName() == null || user.getName().trim().length() == 0) {
            System.out.println("姓名不能为空");
            return false;
        }
        if (user.getAge() == null || user.getAge() <= 0) {
            System.out.println("年龄不能为空或小于零");
            return false;
        }
        return this.target.save(user);
    }

    @Override
    public List query() {
        return null;
    }

    @Override
    public boolean delete() {
        return false;
    }
}
