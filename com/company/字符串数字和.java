package com.company;

public class 字符串数字和 {
    public static void main(String[] args) {
        String s = "00000000";
        System.out.println(digitSum(s,3));
    }
    public static String digitSum(String s, int k) {
        while (s.length()/k!=0){
            if (s.length()/k==1&&s.length()%k==0){
                break;
            }
            String ans = "";
            int count = 0;
            int sum = 0;
            for (int i = 0;i<s.length();i++){
                if (count<k){
                    sum+=Integer.valueOf(s.charAt(i)+"");
                    count++;
                }
                else {
                    ans = ans + sum;
                    sum = 0;
                    sum+=Integer.valueOf(s.charAt(i)+"");
                    count=1;
                }
                if (i==s.length()-1){
                    ans = ans + sum;
                }
            }
            s = ans;
        }
        return s;
    }

}
