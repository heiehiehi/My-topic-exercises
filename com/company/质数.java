package com.company;

public class 质数 {
    public static void main(String[] args) {
        int count = 2;
        boolean flag = true;
        int i = 5;
        while(true){
            flag = true;
            for (int j = 2;j<=Math.sqrt(i);j++){
                if (i%j==0){
                    flag = false;
                }
            }
            if (flag){
                count++;
            }
            if (count==2019){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
