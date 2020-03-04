package com.zeroten.javales.interfaceLesson;

import org.testng.annotations.Test;

public class InterfaceTest {
    @Test
    public void testInterface() {
//        Interface interface1= new Interface();
        InterfaceImplement interface2 = new InterfaceImplement();
        interface2.method();
        interface2.method2();
        interface2.print();
        System.out.println(interface2 instanceof Interface);
        System.out.println(interface2 instanceof Interface2);

        System.out.println(Interface.MAX_COUNT);
        System.out.println(InterfaceImplement.MAX_COUNT);
        System.out.println(interface2.MAX_COUNT);

        Interface.print1();
//        InterfaceImplement.print1();
    }
}
