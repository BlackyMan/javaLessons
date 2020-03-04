package com.zeroten.javales.interfaceLesson;

import org.testng.annotations.Test;

import javax.xml.crypto.Data;
import java.util.Date;

public class EmployeeTest {
    @Test
    public void testPrintInfo() {
        Employee emp = new Employee("celina", new Date(), 100);
//        emp.setName("celina");
//        emp.setHireDay(new Date());
//        emp.setSalary(100);
        emp.printInfo();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Manager man = new Manager("manager", new Date(), 100, 50);
        /*man.setName("manager");
        man.setHireDay(new Date());
        man.setSalary(100);
        man.setBonus(50);*/
        man.printInfo();
    }

    @Test
    public void testPolymorphism() {
        Employee emp = new Employee("employee", new Date(), 100);
        Manager man = new Manager("manager", new Date(), 100, 50);
        System.out.println("我的奖金是：" + man.getBonus());
        MasterManager mas = new MasterManager("master", new Date(), 100, 100);
        System.out.println("我的奖金是：" + mas.getBonus());

        Employee tmp = emp;
        tmp.printInfo();
        tmp = man;
        tmp.printInfo();
//        System.out.println("我的奖金是：" + tmp.getBonus());
        Manager man2 = (Manager) tmp;
        System.out.println("我的奖金是：" + man2.getBonus());
        System.out.println(tmp instanceof Employee);
        System.out.println(tmp instanceof Manager);
        System.out.println(tmp instanceof MasterManager);

        tmp = mas;
        mas.printInfo();
        System.out.println(tmp instanceof Employee);
        System.out.println(tmp instanceof Manager);
        System.out.println(tmp instanceof MasterManager);

        Object obj = new Date();
//        Manager man3 = (Manager) obj;
        if (obj instanceof Manager) {
            Manager man4 = (Manager) obj;
        } else {
            System.out.println("object不是一个manager");
        }
    }

    @Test
    public void testObjectMethod() {
        Employee employee = new Employee();
        System.out.println(employee.getClass().getName());
        System.out.println(employee.getClass().getSimpleName());
        System.out.println(employee.getClass().hashCode());
        System.out.println(employee.getClass().toString());

        int arr[] = new int[0];
        System.out.println(arr.getClass().getName());
        System.out.println(arr.getClass().getSimpleName());
        System.out.println(arr.getClass().hashCode());
        System.out.println(arr.getClass().toString());

        Employee employee2 = new MasterManager();
        System.out.println(employee2.getClass().getName());
        System.out.println(employee2.getClass().getSimpleName());
        System.out.println(employee2.getClass().hashCode());
        System.out.println(employee2.getClass().toString());
    }
}
