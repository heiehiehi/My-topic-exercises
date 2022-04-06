package com.company;

import java.math.BigInteger;

public class 数列求和 {
    public static void main(String[] args) {

        BigInteger sum = new BigInteger("0");
        for (int i = 1;i<=64;i++){
            BigInteger max = new BigInteger(i+"");
            max = max.multiply(max);
            sum = sum.add(max);
        }
        System.out.println(sum);
    }
}
