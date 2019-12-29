package com.blacky.javales;

public class AgeCheck {
    public static String getAgeName(int num) {
        if (num < 7) return "儿童";
        if (num < 18) return "少年";
        if (num < 41) return "青年";
        if (num < 60) return "中年";
        return "老年";
    }

}
