package com.zeroten.javales.classobject;

import org.testng.annotations.Test;

public class Constitution {
    //类变量、静态域变量
    private static String count;
    //实例变量、域变量
    private String name;

    {
        //实例代码块、初始化代码块
        System.out.println("类里方法之外用大括号括起来，static修饰的代码块");
    }

    //构造器方法
    public Constitution() {
    }

    //方法
    public void println() {
        {
            System.out.println("代码块");
        }
    }

    //静态方法
    public static void staticPrintln() {

    }

    //内部类
    class InnerClass {

    }

    @Test
    public void test1() {
    }
}
