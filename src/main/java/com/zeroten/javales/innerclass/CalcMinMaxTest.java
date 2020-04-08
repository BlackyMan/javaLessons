package com.zeroten.javales.innerclass;

import org.testng.annotations.Test;

import java.util.Arrays;

public class CalcMinMaxTest {
    @Test
    public void testCalc() {
        int[] params = {1, 2, 3, 4, 5};
//        int[] result = CalcMinMax.calc(params);
//        System.out.println(Arrays.toString(result));
//        System.out.println("最大值：" + result[0]);
//        System.out.println("最小值：" + result[1]);

//        CalcMinMax.Pair pair = CalcMinMax.calc2(params);
//        System.out.println("最大值：" + pair.getMaxValues());
//        System.out.println("最小值：" + pair.getMinValues());

        int value = CalcMinMax.calc2(1, 2, 3).getMinValues();
        System.out.println(value);
        int value2 = CalcMin.calc(1, 2, 3).getMinValues();
        System.out.println(value2);
    }
}
