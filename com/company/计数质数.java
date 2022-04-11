package com.company;

public class 计数质数 {
    public static void main(String[] args) {
        int n = 2;
        if (n==1||n==0||n==2){
            System.out.println(0);
        }
        int count = 1;
        for (int i = 3;i<n;i++){
            boolean flag = true;
            for (int j = 2;j<=Math.sqrt(i);j++){
                if (i%j==0){
                    flag = false;
                }
            }
            if (flag){
                count++;
            }
        }
        System.out.println(count);
    }
}
