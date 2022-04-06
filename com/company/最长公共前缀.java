package com.company;

public class 最长公共前缀 {
    public static void main(String[] args) {
        String s[] = {"light"};
        System.out.println(longestCommonPrefix(s));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length==1){
            return strs[0];
        }
        else if (strs.length==0){
            return "";
        }

        String s = strs[0];
        String ans = "";
        int a1;
        int a2;

        for (int i = 1;i< strs.length;i++){
            a1 = 0;
            a2 = 0;
            while(a1<strs[i].length()&&a2<s.length()){
                if (strs[i].charAt(a1)==s.charAt(a2)){
                    ans = ans + s.charAt(a2) ;
                    a1++;
                    a2++;
                }
                else {
                    break;
                }
            }
            s = ans;
            ans = "";
        }
        return s;
    }
}
