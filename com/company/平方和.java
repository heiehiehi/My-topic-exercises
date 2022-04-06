package com.company;

public class 平方和 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 0;i<=2019;i++){
            String s = String.valueOf(i);
            if (s.contains("2")||s.contains("0")||s.contains("1")||s.contains("9")){
                sum+=i*i;
            }
        }
        System.out.println(sum);
    }
}
