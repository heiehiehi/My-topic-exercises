package com.company;

import java.util.Scanner;

public class 印章 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        Double dp[][] = new Double[25][25];

        for (int i=1;i<=m;i++){
            for (int j =1;j<=n;j++){
                if (i<j)dp[i][j] = 0.0;
                if (j==1){
                    dp[i][j] = Math.pow(1.0/n,i-1);
                }
                else {
                    dp[i][j] = dp[i-1][j]*(j*1.0/n)+dp[i-1][j-1]*((n-j+1)*1.0/n);
                }
            }
        }

        System.out.printf("%.4f",dp[m][n]);

    }
}
