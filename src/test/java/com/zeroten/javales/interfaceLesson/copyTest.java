package com.zeroten.javales.interfaceLesson;

import org.testng.annotations.Test;

public class copyTest{
    @Test
    public void testCopy() throws CloneNotSupportedException {
        Employee e1 = new Employee();
        Employee e2 = e1.clone();
    }
}
