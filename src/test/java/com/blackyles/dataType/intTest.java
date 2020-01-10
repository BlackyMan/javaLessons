package com.blackyles.dataType;

import org.testng.annotations.Test;

public class intTest {
    @Test
    public void test整数类型() {
        // 下边赋值语句超过 short 的最大值 32767，程序在编译时就会报错
//     short s1 = 32768;
        // 数值计算时如果计算结果超长了，程序不会报任何错误，会给你一个错误的结果
        Integer n1 = 2 * Integer.MAX_VALUE;
        System.out.println(n1);

        long n2 = 1000L;
        System.out.println(n2);

        int n3 = 0x0F;
        System.out.println(n3);

        int n4 = 010;
        System.out.println(n4);

        int n5 = 0b1_0001;
        System.out.println(n5);
    }

    @Test
    public void testChar() {
        char c1 = 'A';
        char c2 = '\u0000';
        char c3 = '\uFFFF';
        char c4 = 65;
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);
//        System.out.println(c4);
//        System.out.println(Character.isJavaIdentifierStart('A'));
//        System.out.println(Character.isJavaIdentifierStart('a'));
//        System.out.println(Character.isJavaIdentifierStart('$'));
//        System.out.println(Character.isJavaIdentifierStart('_'));
//        System.out.println(Character.isJavaIdentifierStart('2'));
//
//        System.out.println(Character.isJavaIdentifierPart('A'));
//        System.out.println(Character.isJavaIdentifierPart('a'));
//        System.out.println(Character.isJavaIdentifierPart('$'));
//        System.out.println(Character.isJavaIdentifierPart('_'));
//        System.out.println(Character.isJavaIdentifierPart('2'));
//        Integer n1 = 127;
//        Integer n2 = 127;
//        Integer n3 = 128;
//        Integer n4 = 128;
//        System.out.println((n1 == n2) + "," + (n3 == n4));

        int n1 = 127;
        Integer n2 = new Integer(127);
        int n3 = 128;
        Integer n4 = new Integer(128);
        System.out.println((n1 == n2) + "," + n2.equals(n1) + "," + (n3 == n4) + "," + n4.equals(n3));
    }

    @Test
    public void testStringLength() {
        String str = "hello,\uD835\uDD5D\uD835\uDD60\uD835\uDD60\uD835\uDD5C";
        System.out.println(str);
        System.out.println("length is: " + str.length());
        System.out.println("code point count is: " + str.codePointCount(0, str.length()));
    }

    @Test
    public void testIndexOf() {
        String string = "hello world,today is 2020-01-10.";
//        int index = string.length();
        int index = 0;
        do {
            int result = string.indexOf('o', index + 1);
            if (result == -1) {
                break;
            }
            index = result;
            System.out.printf("we can find 'o' in %d.%n", index);
        } while (true);
        int index2 = string.length();
        do{
            int result2 = string.lastIndexOf('o',index2 - 1);
            if(result2 == -1){
                break;
            }
            index2 = result2;
            System.out.printf("we can find letter 'o' in %d.%n",index2);
        }while(true);
    }
}
