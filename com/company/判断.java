package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class 判断 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];

        for (int i=0;i<n;i++){
            s[i] = (i+1)+"";
        }
        int sum = 0;
        for (int i=0;i<n;i++){
            if (s[i].contains("2")||s[i].contains("0")||s[i].contains("9")||s[i].contains("1")){
                sum+=(Integer.valueOf(s[i]));
            }
        }
        System.out.println(sum);

    }
}
