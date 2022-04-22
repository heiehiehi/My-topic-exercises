package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 电话号码的字母组合 {
    public static void main(String[] args) {
        String digits = "";
        List<String> ans = letterCombinations(digits);
        for (String i:ans){
            System.out.println(i);
        }
    }
    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.equals("")){
            return ans;
        }

        Map<Character,char[]> biao = new HashMap<>();
        biao.put('2', new char[]{'a','b','c'});
        biao.put('3', new char[]{'d','e','f'});
        biao.put('4', new char[]{'g','h','i'});
        biao.put('5', new char[]{'j','k','l'});
        biao.put('6', new char[]{'m','n','o'});
        biao.put('7', new char[]{'p','q','r','s'});
        biao.put('8', new char[]{'t','u','v'});
        biao.put('9', new char[]{'w','x','y','z'});
        List<char[]> list = new ArrayList<>();
        for (int i=0;i<digits.length();i++){
            list.add(biao.get(digits.charAt(i)));
        }

        helper(ans,list,0,"");
        return ans;
    }
    public static void helper(List<String> ans,List<char[]> list,int now,String res){
        if (now == list.size()){
            ans.add(res);
            return;
        }
        char[] ceng = list.get(now);
        for (int i = 0;i<ceng.length;i++){
            String mid = res;
            mid = mid + ceng[i];
            helper(ans,list,now+1,mid);
        }
    }
}
