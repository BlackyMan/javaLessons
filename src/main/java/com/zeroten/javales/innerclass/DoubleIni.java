package com.zeroten.javales.innerclass;

import java.util.ArrayList;
import java.util.List;

public class DoubleIni {
    public static void main(String[] args) {
        List<Integer> numbs = new ArrayList();
        numbs.add(1);
        numbs.add(2);
        numbs.add(3);
        numbs.add(4);
        numbs.add(5);
        System.out.println("numbs->" + numbs);

        class ArrayListNew extends ArrayList {
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        }
        List<Integer> numbs2 = new ArrayListNew();
        numbs2.add(1);
        numbs2.add(2);
        numbs2.add(3);
        numbs2.add(4);
        System.out.println("numbs2->" + numbs2);

        List<Integer> numbs3 = new ArrayList() {{
            add(1);
            add(2);
            add(3);
            add(4);
        }};
        System.out.println("numb3->" + numbs3);

    }
}
