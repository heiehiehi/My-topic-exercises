package com.company;

public class 替换空格 {
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }
    public static String replaceSpace(String s) {
        String s2 = "";
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                s2 = s2 + "%20";
            }
            else {
                s2 = s2 + s.charAt(i);
            }
        }
        return s2;
    }
}
