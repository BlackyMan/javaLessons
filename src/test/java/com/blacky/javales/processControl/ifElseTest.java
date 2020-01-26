package com.blacky.javales.processControl;

import org.testng.annotations.Test;

import java.util.Random;

public class ifElseTest {
    @Test
    public void testWhile() {
        boolean isContinue = true;
        int time = 0;
        while (isContinue) {
            int num = new Random().nextInt(1000);
            if (num % 30 == 0) {
                System.out.println(num + "被30整除，退出循坏");
                isContinue = false;
            } else {
                System.out.println(num + "不能被30整除，继续循环");
            }
            time++;
        }
        System.out.println("循环次数：" + time);
    }

    @Test
    public void testFor() {
        int total = 0;
        for (int num = 0; num <= 100; num++) {
            if (num % 2 != 0) {
                System.out.println(num);
                total++;
            }
        }
        System.out.println("total:" + total);
    }

    @Test
    public void testSwitch() {
        int cmdN = 1;
        switch (cmdN) {
            case 1:
                System.out.println("clean the room");
                break;
            case 2:
                System.out.println("play the music");
                break;
            default:
                System.out.println("unknow");
        }
    }

    int getMaxNumRem7(int n1, int n2) {
        for (int num = n2; num > 0; num--)
            if (num % n1 == 7)
                return num;
        return -1;
    }

    @Test
    public void testReturn() {
        System.out.println(getMaxNumRem7(13, 100));
    }

    @Test
    public void testContinu() {
        int total = 0;
        int times = 0;
        for (int num = 100; num >= 0; num--) {
            if (num % 7 != 0)
                continue;
            System.out.println(num);
            total += num;
            times++;
        }
        System.out.println("total:" + total);
        System.out.println("times:" + times);
    }

    @Test
    public void testInteger() {
        int n1 = 127;
        Integer n2 = new Integer(127);
        int n3 = 128;
        Integer n4 = new Integer(128);
        System.out.println((n1 == n2) + "," + n2.equals(n1) + "," + (n3 == n4) + "," + n4.equals(n3));
    }

    int getMaxNumRem8(int n1, int n2) {
        for (int i = n2; i >= 0; i--) {
            if (i % n1 == 8) return n1;
        }
        return -1;
    }

    @Test
    public void testGetMaxNumRem8() {
//        System.out.println(getMaxNumRem8(2012, 2020));
//        String str = "hello,\uD835\uDD5D\uD835\uDD60\uD835\uDD60\uD835\uDD5C";
//        System.out.println(str);
//        System.out.println("length is: " + str.length());
//        System.out.println("code point count is: " + str.codePointCount(0, str.length()));
        System.out.println("hello, world!".replace('o', 'A'));
        System.out.println("hello, world!".replace("o", "OOO"));
        System.out.println("hello, world!".replaceAll("o", "oOO"));
    }

    @Test
    public void testStringBufferBuilder() {
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 50000; i++) {
            str += i; }
        System.out.println(str.length());
        System.out.println("     " + (System.currentTimeMillis() - start) + "ms");
        start = System.currentTimeMillis();
        str = "";
        for (int i = 0; i < 50000; i++) {
            StringBuilder tmp = new StringBuilder();
            tmp.append(str);
            tmp.append(i);
            str = tmp.toString();
        }
        System.out.println(str.length());
        System.out.println("     " + (System.currentTimeMillis() - start) + "ms");
        start = System.currentTimeMillis();
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            tmp.append(i);
        }
        System.out.println(tmp.length());
        System.out.println("     " + (System.currentTimeMillis() - start) + "ms");
    }
}
