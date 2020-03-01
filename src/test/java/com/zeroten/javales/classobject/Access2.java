package com.zeroten.javales.classobject;

import org.testng.annotations.Test;

public class Access2 {
    @Test
    public void testPkg() {
        Access access = new Access();
        System.out.println(access.pub);
        System.out.println(access.pro);
        System.out.println(access.def);
//        System.out.println(access.pri);
        System.out.println(access.getPub());
        System.out.println(access.getPro());
        System.out.println(access.getDef());
//        System.out.println(access.getPri());
    }
}
