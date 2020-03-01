package com.zeroten.javales.array;

import com.zeroten.javales.classobject.Access;
import org.testng.annotations.Test;

public class Access5 {
    @Test
    public void testDifPkg() {
        Access access = new Access();
        System.out.println(access.pub);
//        System.out.println(access.pro);
//        System.out.println(access.def);
//        System.out.println(access.pri);
        System.out.println(access.getPub());
//        System.out.println(access.getPro());
//        System.out.println(access.getDef());
//        System.out.println(access.getPri());
    }
}
