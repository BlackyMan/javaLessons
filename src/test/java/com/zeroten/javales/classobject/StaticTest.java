package com.zeroten.javales.classobject;

public class StaticTest {
    private static final int MAX_COUNT;
    private static int count;

    static {
        MAX_COUNT = 6;
    }

    public static void printCount() {
        System.out.println(String.format("总共有%d个实例", count));
    }

    public StaticTest() throws Exception {
        count++;
        if (count > MAX_COUNT) {
            throw new Exception(String.format("只能创建%d个实例", MAX_COUNT));
        }
    }

    public static void main(String[] arg) throws Exception {
        new StaticTest();
        new StaticTest();
        StaticTest obj = new StaticTest();
        new StaticTest();
        new StaticTest();
        new StaticTest();
        new StaticTest();
        obj.printCount();
        StaticTest.printCount();
    }
}
