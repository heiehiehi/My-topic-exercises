package com.company;

import java.util.Scanner;

public class 成绩分析 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        arr[0] = sc.nextInt();
        int max = 0;
        int min = 0;
        int sum = arr[0];
        for (int i=1;i<arr.length;i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
            if (arr[i]>arr[max]){
                max = i;
            }
            if (arr[i]<arr[min]){
                min = i;
            }
        }
        Double power = (sum+0.0)/n;
        System.out.println(arr[max]);
        System.out.println(arr[min]);
        System.out.printf("%.2f",power);

    }
}
