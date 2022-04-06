package com.company;

public class 奇数倍数 {
    public static void main(String[] args) {
        for (int i = 1;;i+=2){
            String s = String.valueOf(2019*i);
            boolean flag = true;
            for (int j = 0;j<s.length();j++){
                if (s.charAt(j)%2==0){
                    flag = false;
                }
            }
            if (flag){
                System.out.println(s);
                break;
            }
        }
    }
}

