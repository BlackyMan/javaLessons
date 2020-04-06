package com.zeroten.javales.innerclass;

import org.testng.annotations.Test;

import java.util.Arrays;

public class CalcMinMaxTest {
    @Test
    public void testCalc() {
        int[] params = {1, 2, 3, 4, 5};
        int[] result = CalcMinMax.calc(params);
        System.out.println(Arrays.toString(result));
        System.out.println("最大值：" + result[0]);
        System.out.println("最小值：" + result[1]);
    }
}
