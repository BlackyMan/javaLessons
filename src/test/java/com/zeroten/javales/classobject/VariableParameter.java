package com.zeroten.javales.classobject;

import org.testng.annotations.Test;

public class VariableParameter {
    private int index;

    public void println(String name) {
        System.out.println(index + ".hello," + name);
    }

    public void println(int... num) {
        if (num == null) {
            System.out.println("params are null");
        }
        if (num.length == 0) {
            System.out.println("length is zero");
        }
        System.out.println("打印传入的可变参数：");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    @Test
    public void testStr() {
//        VariableParameter obj = new VariableParameter();
//        obj.println("blacky");
//        println("celina");
        this.println("celina");
    }

    @Test
    public void testInt() {
        println();
        println(1);
        println(1, 2, 5);
    }
}
