package com.company;

import java.math.BigInteger;

public class 移除指定数字得到的最大结果 {
    public static void main(String[] args) {
        String number = "12321";
        char digit = '3';
        System.out.println(removeDigit(number,digit));

    }
    public static String removeDigit(String number, char digit) {
        BigInteger max = new BigInteger("0");
        for (int i = 0;i<number.length();i++){
            if (number.charAt(i)==digit){
                String ans = number.substring(0,i)+number.substring(i+1);
                BigInteger A = new BigInteger(ans);
                if (A.compareTo(max)==1){
                    max = A;
                }
                System.out.println(ans);
            }
        }
        return max.toString();
    }
}
