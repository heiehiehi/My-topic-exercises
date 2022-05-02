package com.company;

public class 最小差值I {
    public static void main(String[] args) {
        int nums[] = {0,10};
        System.out.println(smallestRangeI(nums,2));
    }
    public static int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 0;i<nums.length;i++){
            if (nums[i]<min){
                min = nums[i];
            }
            if (nums[i]>max){
                max = nums[i];
            }
        }
        if (max-min>2*k){
            return max-min-2*k;
        }
        else {
            return 0;
        }
    }
}
