package com.company;

import java.util.Arrays;

public class 找到最接近0的数字 {
    public static void main(String[] args) {
        int nums[] = {-2,-2};
        System.out.println(findClosestNumber(nums));
    }
    public static int findClosestNumber(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        if (nums[0]>0){
            return nums[0];
        }
        if (nums[nums.length-1]<0){
            return nums[nums.length-1];
        }
        int sp = 0;
        for (int i = 0;i<nums.length-1;i++){
            if (nums[i+1]>=0){
                break;
            }
            sp++;
        }
        System.out.println(sp);
        if (Math.abs(nums[sp])<Math.abs(nums[sp+1])){
            return nums[sp];
        }
        else {
            return nums[sp+1];
        }
    }
}
