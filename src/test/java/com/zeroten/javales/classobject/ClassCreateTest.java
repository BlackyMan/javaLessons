package com.zeroten.javales.classobject;

public class ClassCreateTest {
    //    private String name = "成员变量";
    private static int maxCount = 100;
    private final String name;

    {
//        name = "成员变量";
        System.out.println("执行代码块1");
    }

    static {
        maxCount = 200;
        System.out.println("执行静态代码块1");
    }

    public ClassCreateTest() {
        name = "成员变量";
        System.out.println("执行构造器");
    }

    public void println() {
        System.out.println("打印" + name);
    }

    public static void main(String[] args) {
        new ClassCreateTest().println();
    }

    {
//        name = "成员变量";
        System.out.println("执行代码块2");
    }

    static {
        maxCount = 200;
        System.out.println("执行静态代码块2");
    }
}
