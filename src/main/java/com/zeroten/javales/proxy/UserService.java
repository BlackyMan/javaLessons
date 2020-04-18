package com.zeroten.javales.proxy;

import java.lang.reflect.Proxy;

public class UserService {
    public static void directCall() {
        User user1 = new User("blacky", 18);
        new UserDaoImpl().save(user1);
        User user2 = new User("", 18);
        new UserDaoImpl().save(user2);
        User user3 = new User("blacky", -18);
        new UserDaoImpl().save(user3);
    }

    public static void staticProxyCall() {
        User user1 = new User("", -18);
        UserDao user = new UserDaoImpl();
        UserDaoProxy proxy = new UserDaoProxy(user);
        proxy.save(user1);
    }

    public static void jdkProxyCall() {
        User user = new User("", -1);
        UserDaoImpl userDao = new UserDaoImpl();
        UserInvocationHandler handler = new UserInvocationHandler(userDao);
        UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(
                userDao.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(),
                handler
        );
        userDaoProxy.save(user);
        userDaoProxy.delete();
    }

    public static void jdkProxyCall2() {
        User user = new User("blacky", 18);
        User2Dao user2Dao = new User2Dao();
        UserInvocationHandler handler = new UserInvocationHandler(user2Dao);
        User2Dao user2DaoProxy = (User2Dao) Proxy.newProxyInstance(
                user2Dao.getClass().getClassLoader(),
                user2Dao.getClass().getInterfaces(),
                handler
        );
        user2DaoProxy.save(user);
    }

    public static void cglibProxyCall() {
        User user = new User("blacky", -18);
        User2Dao user2Dao = new User2Dao();
        User2DaoCglibProxy cglibProxy = new User2DaoCglibProxy(user2Dao);
        User2Dao user2DaoProxy = (User2Dao) cglibProxy.getProxyInstance();
        user2DaoProxy.save(user);

//        UserDao userDao = new UserDaoImpl();
//        User2DaoCglibProxy cglibProxy2 = new User2DaoCglibProxy(userDao);
//        UserDao userDaoProxy = (UserDao) cglibProxy2.getProxyInstance();
//        userDaoProxy.save(user);
    }

    public static void main(String[] args) {
//        directCall();
//        staticProxyCall();
//        jdkProxyCall();
//        jdkProxyCall2();
        cglibProxyCall();

    }
}
