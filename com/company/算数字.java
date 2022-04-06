package com.company;

public class 算数字 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int i = 1;
        boolean flag = true;
        while(flag){
            String s = String.valueOf(i);
            for (int j = 0;j<s.length();j++){
                arr[(int)(s.charAt(j)-'0')] ++;
                if (arr[(int)(s.charAt(j)-'0')]==2021){
                    flag = false;
                    break;
                }
            }
            if (flag){
                i++;
            }
        }
        System.out.println(i);
    }
}
