package com.company;

public class 年号子串 {
    public static void main(String[] args) {
        int year = 2019%26;
        char S = (char)(((int)'A')+(year-1));
        String ans = ""+S;
        int count = 2019;
        int yu;
        while (count/26!=0){
            count = count/26;
            yu = count%26;
            ans = (char)(((int)'A')+(yu-1)) + ans;
        }
        System.out.println(ans);
    }
}
