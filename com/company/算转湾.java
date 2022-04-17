package com.company;

import java.util.Arrays;

public class 算转湾 {
    public static void main(String[] args) {
        int grid[][] = {{23,17,15,3,20},{8,1,20,27,11},{9,4,6,2,21},{40,9,1,10,6},{22,7,4,5,3}};
        System.out.println(maxTrailingZeros(grid));
    }
    public static int maxTrailingZeros(int[][] grid) {
        int arr[][] = new int[grid.length][grid[0].length];
        int ans[][] = new int[grid.length][grid[0].length];
        for (int i=0;i<grid.length;i++){
            for (int j =0;j<grid[i].length;j++){
                if (grid[i][j]%5==0){
                    if (grid[i][j]%1000==0){
                        arr[i][j] = 3;
                    }
                    else if (grid[i][j]%100==0){
                        arr[i][j] = 2;
                    }
                    else {
                        arr[i][j] = 1;
                    }
                }
            }
        }
        for (int i=0;i<grid.length;i++){
            for (int j =0;j<grid[i].length;j++){
                int sum = 0;
                for (int k = 0;k<=j;k++){
                    sum += arr[i][k];
                }
                for (int k = 0;k < i;k++){
                    sum += arr[k][j];
                }
                ans[i][j] = sum;
            }
        }
        int max = 0;
        for (int i=0;i<grid.length;i++){
            for (int j =0;j<grid[i].length;j++){
                if (max<ans[i][j]){
                    max = ans[i][j];
                }
            }
        }
        return max;
    }
}
