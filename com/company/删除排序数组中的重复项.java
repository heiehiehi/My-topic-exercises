package com.company;

import java.util.Arrays;

public class 删除排序数组中的重复项 {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int sp = 1;
        for (int i = 1;i<nums.length;i++){
            if (nums[i-1]==nums[i]&&count<2){
                count++;
                nums[sp] = nums[i];
                sp++;
            }
            else if (nums[i-1]==nums[i]&&count>=2){
                continue;
            }
            else {
                count = 1;
                nums[sp] = nums[i];
                sp++;
            }
        }
        return sp;
    }
}
