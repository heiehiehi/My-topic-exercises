package com.company;

public class 统计是给定字符串前缀的字符串数目 {
    public static void main(String[] args) {
        String words[] = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        System.out.println(countPrefixes(words,s));
    }
    public static int countPrefixes(String[] words, String s) {
        int count = 0;
        boolean flag = true;
        for (int i = 0;i<words.length;i++){
            if (words[i].length()>s.length()){
                continue;
            }
            else {
                flag = true;
                for (int j = 0;j<words[i].length();j++){
                    if (s.charAt(j)!=words[i].charAt(j)){
                        flag = false;
                    }
                }
                if (flag){
                    count++;
                }
            }
        }
        return count;
    }
}
