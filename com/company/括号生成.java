package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 括号生成 {
    public static void main(String[] args) {
        int n = 3;
        List<String> ans = generateParenthesis(n);
        for (String i:ans){
            System.out.println(i);
        }
    }
    public static List<String> generateParenthesis(int n) {
        int chun[] = {n,n};
        List<String> ans = new ArrayList<>();
        helper(ans,chun,"");
        return ans;
    }
    public static void helper(List<String> ans,int chun[],String res){
        if (chun[0]+chun[1]==0){
            ans.add(res);
            return;
        }
        int get[] = Arrays.copyOf(chun,chun.length);
        int get2[] = Arrays.copyOf(chun,chun.length);
        if (chun[0] == 0){
            String temp = res;
            temp = res + ')';
            get2[1]--;
            helper(ans,get2,temp);
        }
        else {
            String temp = res;
            temp = res + '(';
            get[0]--;
            helper(ans,get,temp);
            if (chun[0]<chun[1]){
                temp = res;
                temp = res + ')';
                get2[1]--;
                helper(ans,get2,temp);
            }
        }
    }
}
