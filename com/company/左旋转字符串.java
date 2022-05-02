package com.company;

public class 左旋转字符串 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        String s1 = reverseLeftWords(s,2);
        System.out.println(s1);
    }
    public static String reverseLeftWords(String s, int n) {
        String s1 = s.substring(0,n);
        String s2 = s.substring(n,s.length());
        String ans = s2+s1;
        return ans;
    }
}
