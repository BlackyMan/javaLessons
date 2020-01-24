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
        System.out.println("循环次数："+time);
    }

    @Test
    public void testFor() {
        int total = 0;
        for (int num = 0;num <= 100;num++){
            if (num % 2 != 0){
                System.out.println(num);
                total++;
            }
        }
        System.out.println("total:"+total);
    }

    @Test
    public void testSwitch() {
        int cmdN = 1;
        switch (cmdN){
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

    int getMaxNumRem7(int n1,int n2){
        for(int num = n2;num > 0;num--)
            if(num % n1 == 7)
                return num;
        return -1;
    }

    @Test
    public void testReturn() {
        System.out.println(getMaxNumRem7(13,100));
    }

    @Test
    public void testContinu() {
        int total = 0;
        int times = 0;
        for (int num =100;num >=0;num--) {
            if (num % 7 != 0)
                continue;
            System.out.println(num);
            total += num;
            times++;
        }
        System.out.println("total:"+total);
        System.out.println("times:"+times);
    }

    @Test
    public void testInteger() {
        int n1 = 127;
        Integer n2 = new Integer(127);
        int n3 = 128;
        Integer n4 = new Integer(128);
        System.out.println((n1 == n2) + "," + n2.equals(n1) + "," + (n3 == n4) + "," + n4.equals(n3));
    }
}
