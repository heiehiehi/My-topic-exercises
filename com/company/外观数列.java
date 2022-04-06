package com.company;

public class 外观数列 {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
    public static String countAndSay(int n) {
        String ans = "1";
        int count = 1;
        for (int i=0;i<n-1;i++){
            String temp = "";
            for (int j=0;j<ans.length()-1;j++){
                if (ans.charAt(j)==ans.charAt(j+1)){
                    count++;
                }
                else{
                    temp = temp + count + ""+ ans.charAt(j);
                    count = 1;
                }
            }
            ans = temp + count + ""+ ans.charAt(ans.length()-1);
            count = 1;
        }
        return  ans;
    }
}
