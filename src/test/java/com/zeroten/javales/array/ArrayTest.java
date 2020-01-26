package com.zeroten.javales.array;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayTest {
    @Test
    public void testArrayValue() {
        Integer[] integerArr = {1, 2, 3, null, 4};
        int[] intArr = {1, 2, 3, 4};
        System.out.println("integerArr:" + Arrays.toString(integerArr));
    }

    @Test
    public void testForValue() {
        Integer[] integerArr = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < integerArr.length; i++) {
//            System.out.println("数组下标：" + i + "，数组值：" + integerArr[i]);
//            System.out.println(String.format("数组下标：%d，数组值：%d", i, integerArr[i]));
        }

        int i = 0;
        for (int val : integerArr) {
//            System.out.println(String.format("数组下标：%d，数组值：%d", i, val));
            i++;
        }

        Arrays.asList(integerArr).forEach(val -> {
            System.out.println("数组值为：" + val);
            if (val % 2 == 0) {
                System.out.println("判定为偶数");
            } else {
                System.out.println("判定为奇数");
            }

        });
    }
}