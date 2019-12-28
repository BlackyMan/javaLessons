package com.blacky.javales.processControl;

import org.junit.Test;

public class CodeBlock {
    @Test
    public void testBlockScope(){
        int n1 = 100;
        System.out.println(n1);
        {
//            int n1 = 100;
            int n2 = 200;
            System.out.println(n2);
        }
    }
}
