package com.company;

import java.util.*;

public class 字母异位分组 {
    public static void main(String[] args) {
        String arr[] = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupAnagrams(arr);
        for (List i:ans){
            for (Object j:i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null||strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> ans = new HashMap<>();
        for (String res:strs){
            char res2[] = res.toCharArray();
            Arrays.sort(res2);
            String kk = String.valueOf(res2);
            if (!ans.containsKey(kk)){
                List<String> news = new ArrayList<>();
                news.add(res);
                ans.put(kk,news);
            }
            else {
                ans.get(kk).add(res);
            }
        }
        return new ArrayList<>(ans.values());
    }
}
