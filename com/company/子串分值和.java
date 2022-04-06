package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class 子串分值和 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for (int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                for (int m = i;m<=j;m++){
                    set.add(""+s.charAt(m));
                }
                sum+=set.size();
                set.clear();
            }
        }
        System.out.println(sum);
    }
}
