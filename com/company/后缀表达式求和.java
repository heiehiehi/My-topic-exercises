package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class 后缀表达式求和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int n = N+M+1;
        int arr[] = new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
//        if (M==0){
//            for (int i=0;i<arr.length;i++){
//                sum+=arr[i];
//            }
//        }
//        else{
//            for (int i=0;i<arr.length;i++){
//                sum+=Math.abs(arr[i]);
//            }
//            if (arr[0]>=0){
//                sum-=2*arr[0];
//            }
//            else if (arr[n-1]<=0){
//                sum+=2*arr[n-1];
//            }
//            else{
//                int absmin = arr[0];
//                for (int i=0;i<n;i++){
//                    if (Math.abs(arr[i])<absmin){
//                        absmin=Math.abs(arr[i]);
//                    }
//                }
//                sum-=2*
//            }
//        }

        System.out.println(sum);
    }
}
