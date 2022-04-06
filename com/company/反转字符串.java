package com.company;

import java.util.Arrays;

public class 反转字符串 {
    public static void main(String[] args) {
        char s[] = {'h','c','c','d'};
        int n =  s.length/2;
        char temp;
        for (int i = 0;i<n;i++){
            temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] =temp;
        }
        System.out.println(Arrays.toString(s));
    }
}
