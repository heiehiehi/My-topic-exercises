package com.company;

import java.util.LinkedList;
import java.util.Queue;

import static com.company.打乱数组.arr;

public class 无重复字符的最长子串 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {

        Queue<Character> arr = new LinkedList<>();
        int max = 0;
        for (int i = 0;i<s.length();i++){
            while (arr.contains(s.charAt(i))){
                arr.poll();
            }
            arr.add(s.charAt(i));
            max = Math.max(max,arr.size());
        }
        return max;
    }
}
