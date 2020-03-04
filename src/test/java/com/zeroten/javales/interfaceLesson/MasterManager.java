package com.zeroten.javales.interfaceLesson;

import java.util.Date;

public class MasterManager extends Manager {
    @Override
    public String getName() {
        return "【" + name + "】";
    }

    public MasterManager() {

    }

    public MasterManager(String name, Date hireDay, Integer salary, Integer bonus) {
        super(name, hireDay, salary, bonus);
        System.out.println("执行MasterManager的有参构造方法");
    }
}
