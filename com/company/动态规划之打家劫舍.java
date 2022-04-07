package com.company;

public class 动态规划之打家劫舍 {
    public static void main(String[] args) {
        int nums[] = {2,7,9,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int DP[][] = new int[nums.length][2];
        DP[0][0] = nums[0];
        DP[0][1] = 0;
        for (int i = 1;i<nums.length;i++){
            DP[i][1] = Math.max(DP[i-1][0],DP[i-1][1]);
            DP[i][0] = DP[i-1][1] + nums[i];
        }
        return Math.max(DP[nums.length-1][0],DP[nums.length-1][1]);
    }
}
