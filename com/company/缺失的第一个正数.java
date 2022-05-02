package com.company;

import java.util.Arrays;

public class 缺失的第一个正数 {
    public static void main(String[] args) {
        int nums[] = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        int ans[] = new int[nums.length+1];
        for (int i = 0;i<nums.length;i++){
            if (nums[i]>0&&nums[i]<=nums.length){
                ans[nums[i]] = nums[i];
            }
        }
        for (int i = 1;i<ans.length;i++){
            if (i!=ans[i]){
                return i;
            }
        }
        System.out.println(Arrays.toString(ans));
        return nums.length+1;
    }
}
