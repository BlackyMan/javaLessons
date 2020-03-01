package com.zeroten.javales.classobject;

import org.testng.annotations.Test;

public class MethodParamTest {
    private void changePrimitive(int num) {
        System.out.println("传入：" + num);
        num = 20;
        System.out.println("输出：" + num);
    }

    private void changeReferen(StringBuilder str) {
        System.out.println("传入：" + str.toString());
        str.append("追加");
        System.out.println("输出：" + str.toString());
        str = new StringBuilder();
        str.append("新字符串");
    }

    @Test
    public void testModifyMethodParam() {
        int num = 10;
        changePrimitive(num);
        System.out.println("num=" + num);
        StringBuilder str = new StringBuilder();
        str.append("字符串");
        changeReferen(str);
        System.out.println("str=" + str.toString());
    }
}
