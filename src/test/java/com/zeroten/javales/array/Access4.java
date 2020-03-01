package com.zeroten.javales.array;

import com.zeroten.javales.classobject.Access;
import org.testng.annotations.Test;

public class Access4 extends Access {
    @Test
    public void testExtends() {
        System.out.println(pub);
        System.out.println(pro);
//        System.out.println(def);
//        System.out.println(pri);
        System.out.println(getPub());
        System.out.println(getPro());
//        System.out.println(getDef());
//        System.out.println(getPri());
    }
}
