package com.zeroten.javales.classobject;

import org.testng.annotations.Test;

public class Access {
    public String pub = "public";
    protected String pro = "protected";
    String def = "default";
    private String pri = "private";

    public String getPub() {
        return pub;
    }

    protected String getPro() {
        return pro;
    }

    String getDef() {
        return def;
    }

    private String getPri() {
        return pri;
    }

    @Test
    public void testClass() {
        System.out.println(pub);
        System.out.println(pro);
        System.out.println(def);
        System.out.println(pri);
        System.out.println(getPub());
        System.out.println(getPro());
        System.out.println(getDef());
        System.out.println(getPri());
    }
}
