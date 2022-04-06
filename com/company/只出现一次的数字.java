package com.company;

import java.util.Arrays;

public class 只出现一次的数字 {
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        Arrays.sort(nums);
        for (int i = 0;i<nums.length-1;i++){
            boolean flag = true;
            while (nums[i]==nums[i+1]){
                flag = false;
                i++;
            }
            if (flag){
                System.out.println(nums[i]);
                break;
            }
        }
        System.out.println(nums[nums.length-1]);
    }
}
