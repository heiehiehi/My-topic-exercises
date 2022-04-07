package com.company;

public class 动态规划之最大子序和 {
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int DP[] = new int[nums.length];
        DP[0] = nums[0];
        int max = DP[0];
        for (int i=1;i<nums.length;i++){
            DP[i] = Math.max(DP[i-1],0)+nums[i];
            if (DP[i]>max){
                max = DP[i];
            }
        }
        return max;
    }
}
