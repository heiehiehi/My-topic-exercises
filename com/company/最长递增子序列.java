package com.company;

import java.util.Arrays;

public class 最长递增子序列 {
    public static void main(String[] args) {
        int nums[] = {1};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums) {
        int DP[] = new int[nums.length];
        DP[0] = 1;
        int max = 1;
        for(int i = 1;i<nums.length;i++){
            int temp = 0;
            for (int j = i-1;j>=0;j--){
                if (nums[i]>nums[j]){
                    if (DP[j]>temp){
                        temp = DP[j];
                    }
                }
            }
            DP[i] = temp+1;
            if (DP[i]>max){
                max = DP[i];
            }
        }
        return max;
    }
}
