package com.zeroten.javales.utils;

public class StringUtils {
    public static String trimAll(String str) {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (letter == ' ') continue;
            tmp.append(letter);
        }
        return tmp.toString();
    }

    public static String reverse(String str) {
        StringBuilder tmp = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = chars[i];
            tmp.append(c);
        }
        return tmp.toString();
    }
}