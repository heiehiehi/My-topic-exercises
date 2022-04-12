package com.company;

import java.util.Arrays;

public class 缺失数字 {
    public static void main(String[] args) {
        int nums[] = {0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int max = 0;
        int arr[] = new int[nums.length+1];
        for (int i = 0;i<nums.length;i++){
            if (max<nums[i]){
                max = nums[i];
            }
            arr[nums[i]] = nums[i];
        }
        for (int i = 0;i<arr.length-1;i++){
            if (arr[i]!=i){
                return i;
            }
        }
        return 0;
    }
}
