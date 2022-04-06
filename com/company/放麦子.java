package com.company;

import java.math.BigInteger;

public class 放麦子 {
    public static void main(String[] args) {
        BigInteger sum = new BigInteger("1");
        BigInteger er = new BigInteger("2");
        for (int i = 1;i<64;i++){
            BigInteger max = new BigInteger("2");

            for (int j=1;j<i;j++){
                max = max.multiply(er);
            }
//            System.out.println(max);
            sum = sum.add(max);
        }
        System.out.println(sum);
    }
}
