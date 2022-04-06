package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class 等差数列求和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int min = arr[1]-arr[0];

        for (int i = 0;i<n-1;i++){
            if ((arr[i+1]-arr[i])<min){
                min = arr[i+1]-arr[i];
            }
        }
        if (min == 0){
            System.out.println(n);
            return;
        }

        int count = ((arr[n-1]-arr[0])/min)+1;
        System.out.println(count);
    }
}
