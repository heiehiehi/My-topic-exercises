package com.company;

import java.util.Arrays;

public class 颜色分类 {
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int count[] = new int[3];
        for (int i = 0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int sp = 0;
        for (int i = 0;i<count.length;i++){
            for (int j = 0;j<count[i];j++){
                nums[sp] = i;
                sp++;
            }
        }
    }
}
