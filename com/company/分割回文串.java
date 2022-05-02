package com.company;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class 分割回文串 {
    public static void main(String[] args) {
        String s = "aab";
        ans = partition(s);
    }
    static List<List<String>> ans;
    static Deque<String> res;
    public static List<List<String>> partition(String s) {
        ans = new ArrayList<>();
        res = new LinkedList<>();
        backTracking(s,0);
        return ans;
    }
    public static void backTracking(String s,int Start){
        if (Start>=s.length()){
            ans.add(new ArrayList<>(res));
        }
        for (int i = Start;i<s.length();i++){
            if (huiwen(s,Start,i)){
                String temp = s.substring(Start,i+1);
                res.addLast(temp);
            }
            else {
                continue;
            }
            backTracking(s,i+1);
            res.removeLast();
        }
    }
    public static boolean huiwen(String s,int start,int end){
        for (int i = start , j = end;i<j;i++,j--){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
