package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class 数字三角形 {
    static int max = 0;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        f(arr,0,0,0,0,0);
        System.out.println(max);

    }
    public static void f(int arr[][],int k,int sum,int now,int right,int left){
        if (k==n){
            if (max<sum && Math.abs(right-left)<=1){
                max = sum;
            }
            return;
        }
        sum+=arr[k][now];
        //向左走
        if (k==4){
            f(arr,k+1,sum,now,right,left);
            f(arr,k+1,sum,now+1,right,left);
        }
        else{
            f(arr,k+1,sum,now,right,left+1);
            f(arr,k+1,sum,now+1,right+1,left);
        }

    }
}
