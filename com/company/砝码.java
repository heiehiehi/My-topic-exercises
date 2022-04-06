package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 砝码 {
    static Set<Integer> get = new HashSet<Integer>();
    static int ans = 0;
    public static void f(int arr[],int k,int sum){
        if (sum<0){
            return;
        }
        else{
            get.add(sum);
        }
        if (k==arr.length){
            return;
        }
        for (int i = k;i< arr.length;i++){
            int t = arr[k];
            arr[k] = arr[i];
            arr[i] = t;

            int sum1=sum+arr[k];
            int sum2=sum-arr[k];


            f(arr,k+1,sum1);
            f(arr,k+1,sum2);

            t = arr[k];
            arr[k] = arr[i];
            arr[i] = t;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        f(arr,0,0);
        System.out.println(get.size()-1);

    }
}
