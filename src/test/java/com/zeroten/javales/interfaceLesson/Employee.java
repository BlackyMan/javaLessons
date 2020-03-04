package com.zeroten.javales.interfaceLesson;

import java.util.Date;

public class Employee implements  java.lang.Cloneable {
    protected String name;
    private Date hireDay;
    private Integer salary;

    public Employee() {
        System.out.println("执行Employee的无参构造器");
    }

    public Employee(String name, Date hireDay, Integer salary) {
        System.out.println("执行Employee的有参构造器");
        this.name = name;
        this.hireDay = hireDay;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public Integer getSalary() {
        return salary;
    }

    public final void printInfo() {
        StringBuilder str = new StringBuilder();
        str.append("姓名：");
        str.append(this.getName());
        str.append(",入职时间：");
        str.append(getHireDay());
        str.append("，薪水：");
        str.append(getSalary());
        System.out.println(str.toString());
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}
