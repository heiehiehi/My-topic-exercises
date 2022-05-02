package com.company;

public class 阶乘后的0 {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(100));
    }
    public static int trailingZeroes(int n) {
        int count = 0;
        while (n/5>0){
            count += n/5;
            n = n/5;
        }
        return count;
    }
}
