package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 第一个只出现一次的字符 {
    public static void main(String[] args) {
        String s = "abaccdeff";
        System.out.println(firstUniqChar(s));
    }
    public static char firstUniqChar(String s) {
        List<Character> ans =new ArrayList<>();
        for (int i = 0;i<s.length();i++){
            if (s.lastIndexOf(s.charAt(i))==s.indexOf(s.charAt(i))){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
