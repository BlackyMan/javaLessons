package com.zeroten.javales.proxy;

public class User2Dao {

    public final boolean save(User user) {
        System.out.println("保存用户2：" + user.getName() + "," + user.getAge());
        return true;
    }

}
