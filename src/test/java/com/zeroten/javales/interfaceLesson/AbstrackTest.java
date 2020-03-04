package com.zeroten.javales.interfaceLesson;

import org.testng.annotations.Test;

public class AbstrackTest {
    @Test
    public void testPrint() {
//        Person per = new Person();
//        System.out.println(per.getDescription());
        Person stu = new Student();
        System.out.println(stu.getDescription());
        Person tea = new Teacher();
        System.out.println(tea.getDescription());
    }
}
