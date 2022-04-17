package com.company;

import java.util.Arrays;

public class 新手村 {
    public static void main(String[] args) {
        int arr[][] = {{0,2},{2,1},{2,0}};
        int gem[] = {3,1,2};
        System.out.println(giveGem(gem,arr));
        System.out.println(Arrays.toString(gem));
    }
    public static int giveGem(int[] gem, int[][] operations) {
        int mid;
        for (int i = 0;i<operations.length;i++){
            mid = gem[operations[i][0]]/2;
            gem[operations[i][1]] = gem[operations[i][1]]+mid;
            gem[operations[i][0]] = gem[operations[i][0]] - mid;
        }
        int max = gem[0];
        int min = gem[0];
        for (int i = 1;i<gem.length;i++){
            if (min>gem[i]){
                min = gem[i];
            }
            if (max<gem[i]){
                max = gem[i];
            }
        }
        return max-min;
    }
}
