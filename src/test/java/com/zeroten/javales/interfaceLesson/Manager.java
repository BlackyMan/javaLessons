package com.zeroten.javales.interfaceLesson;

import java.util.Date;

public class Manager extends Employee {
    private Integer bonus;

    public Manager() {
        super("", null, 0);
        System.out.println("执行Manager的无参构造方法");
    }

    public Manager(String name, Date hireDay, Integer salary, Integer bonus) {
        setName(name);
        super.setHireDay(hireDay);
        setSalary(salary);
        setBonus(bonus);
//        super(name,hireDay,salary);
        System.out.println("执行Manager的有参构造方法");
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    //子类覆盖父类的方法，称为复写或者覆盖，用@Override注释
    @Override
    public Integer getSalary() {
        if (bonus == null) {
            return super.getSalary();
        }
        return super.getSalary() + bonus;
    }
}
