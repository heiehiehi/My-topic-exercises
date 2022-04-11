package com.company;

import java.util.Arrays;

public class 公园规划 {
    public static void main(String[] args) {
        int arr[][] = {{0,1},{1,3},{1,2}};
        System.out.println(numFlowers(arr));
    }
    public static int numFlowers(int[][] roads) {
        int arr[] = new int[roads.length+1];
        for (int i = 0;i<roads.length;i++){
            for (int j = 0;j<2;j++){
                arr[roads[i][j]]++;
            }
        }
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        return max+1;
    }
}
