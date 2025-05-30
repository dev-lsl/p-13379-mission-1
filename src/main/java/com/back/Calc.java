package com.back;

public class Calc {
    public static int run(String str) {

        String[] strs = str.split(" \\+ ");
        int num1 = Integer.parseInt(strs[0]);
        int num2 = Integer.parseInt(strs[1]);
        return num1 + num2;

    }
}
