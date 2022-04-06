package com.company;

import java.util.Scanner;

public class 饮料换购 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n;
        while(n>=3){
            sum+=n/3;
            n = n/3+n%3;
        }
        System.out.println(sum);
    }
}
