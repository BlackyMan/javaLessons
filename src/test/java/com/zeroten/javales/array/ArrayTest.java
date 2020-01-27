package com.zeroten.javales.array;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

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

    @Test
    public void testArrayCopy() {
        Integer[] intArr1 = {1, 2, 3, 4, 5, 6, 7};
        Integer[] intArr2 = {8, 9, 0};
        // 拷贝数组 arr1 的前 3 个元素生成一个新的数组
        Integer[] intArr11 = Arrays.copyOfRange(intArr1, 0, 7);
        System.out.println("数组前前七个元素：" + Arrays.toString(intArr11));
        Integer[] intArr12 = Arrays.copyOf(intArr1, 3);
        System.out.println("数组前前三个元素：" + Arrays.toString(intArr12));
        // 拷贝数组 arr1 的后 3 位的元素到一个新的数组
        Integer[] intArr13 = Arrays.copyOfRange(intArr1, intArr1.length - 3, intArr1.length);
        System.out.println("数组的长度：" + intArr1.length);
        System.out.println("数组后三位元素：" + Arrays.toString(intArr13));
        // 拷贝数组 arr1 的第 1 位到第 3 位的元素（不包括第 3 位）
        Integer[] intArr14 = Arrays.copyOfRange(intArr1, 0, 2);
        System.out.println("数组前两位：" + Arrays.toString(intArr14));
        // 拷贝数组 arr2 的后 3 位到 arr1 到后 3 位
        System.arraycopy(intArr2, intArr2.length - 3, intArr1, intArr1.length - 4, 3);
        System.out.println("数组拷贝结果：" + Arrays.toString(intArr1));
    }

    @Test
    public void testArrSort() {
        Integer[] a = {3, 2, 4, 6, 8, 5, 6};
        Arrays.sort(a, Collections.reverseOrder());
        for (int value : a) {
            System.out.println(value);
        }
    }

    @Test
    public void testArrFill() {
        int[] arr = new int[10];
//        Arrays.fill(arr, 5);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 5;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 3; i < arr.length; i++) {
            arr[i] = 0;
        }
//        Arrays.fill(arr, arr.length - 3, arr.length, 0);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 0, 4, 3);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testSort() {
        Integer[] arr = new Integer[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
        System.out.println("排序前数组：" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后数组：" + Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("倒序排列：" + Arrays.toString(arr));
    }

    @Test
    public void testArrays() {
        String[][] users = new String[2][];
        users[0] = new String[4];
        users[0][0] = "blacky";
        users[0][1] = "man";
        users[0][2] = "32";
        users[0][3] = "001";
        users[1] = new String[3];
        users[1][0] = "celina";
        users[1][1] = "woman";
        users[1][2] = "26";
//        users[1][3] = "002";
        for (int i = 0; i < users.length; i++) {
            System.out.println(Arrays.toString(users[i]));
        }
        for (String[] user : users) {
            System.out.println(Arrays.toString(user));
        }
        Arrays.asList(users).forEach(user -> System.out.println(Arrays.toString(user)));
    }

    public int[] twoNum(int[] arr, int target) {
        int times = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                times++;
                if (arr[i] + arr[j] == target) {
                    System.out.println("times:" + times);
                    return new int[]{i, j};
                }
            }
        }
        System.out.println("times:" + times);
        return null;
    }

    public int[] twoNumOptimize(int[] arr, int target) {
        int times = 0;
        Arrays.sort(arr);
        System.out.println("数组排序：" + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > target) {
                System.out.println("排序后第一个数值" + arr[i] + "大于" + target);
                System.out.println("times:" + times);
                return null;
            }
            for (int j = i + 1; j < arr.length; j++) {
                times++;
                if (arr[j] > target) break;
                if (arr[i] + arr[j] == target) {
                    System.out.println("times:" + times);
                    return new int[]{i, j};
                }
            }
        }
        System.out.println("times:" + times);
        return null;
    }

    @Test
    public void testTwoNum() {
        int[] arr = {8, 6, 55, 12, 3, 14, 56, 7, 1, 9};
        int target = 1;
        System.out.println(Arrays.toString(twoNum(arr, target)));
        System.out.println(Arrays.toString(twoNumOptimize(arr, target)));
    }
}