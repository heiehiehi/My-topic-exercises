package com.company;

import java.util.Arrays;

public class 按奇偶排序数组 {
    public static void main(String[] args) {
        int nums[] = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    public static int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            if (nums[left]%2==0){
                left++;
                continue;
            }
            if (nums[right]%2==1){
                right--;
                continue;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }
}
