package com.zeroten.javales.interfaceLesson;

public interface Interface {
    class InnerClass {
    }

    interface InnerInterface {
    }

    int MAX_COUNT = 100;
    public static final int MAX_COUNT1 = 100;

    public void method();

    default void print() {
        System.out.println("我是一个默认方法");
    }

    static void print1() {
        System.out.println("我是java8开始有的静态方法");
    }
}