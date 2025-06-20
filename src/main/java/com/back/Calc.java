package com.back;

public class Calc {

    public static int run(String exp) {
        //공백 제거
        exp = exp.replaceAll(" ","");

        String[] expBits = exp.split("\\+", 2);

        int num1 = Integer.parseInt(expBits[0]);
        int num2 = Integer.parseInt(expBits[1]);

        return num1 + num2;
    }
}
