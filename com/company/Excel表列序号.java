package com.company;

import java.util.Calendar;

public class Excel表列序号 {
    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));
    }
    public static int titleToNumber(String columnTitle) {
        int count = columnTitle.length();
        int sum = 0;
        for (int i = columnTitle.length()-1;i>=0;i--){
            int mul = columnTitle.length()-1-i;
            int temp = columnTitle.charAt(i)-'A'+1;
            for (int j = 0;j<mul;j++){
                temp = temp*26;
            }
            sum+=temp;
        }
        return sum;
    }
}
