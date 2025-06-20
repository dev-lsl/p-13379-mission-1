package com.back;

public class Calc {

    public static int run(String exp) {
        //공백 제거
        exp = exp.replaceAll(" ","");

        if (exp.contains("+")){
            String[] expBits = exp.split("\\+", 2);

            int num1 = Integer.parseInt(expBits[0]);
            int num2 = Integer.parseInt(expBits[1]);

            return num1 + num2;
        }
        if (exp.contains("-")){
            String[] expBits = exp.split("-", 2);

            int num1 = Integer.parseInt(expBits[0]);
            int num2 = Integer.parseInt(expBits[1]);

            return num1 - num2;
        }
        return 0;

    }
}
