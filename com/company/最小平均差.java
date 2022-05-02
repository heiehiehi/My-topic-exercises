package com.company;

import java.util.Arrays;

public class 最小平均差 {
    public static void main(String[] args) {
        int nums[] = {0};
        System.out.println(minimumAverageDifference(nums));
    }
    public static int minimumAverageDifference(int[] nums) {
        long left[] = new long[nums.length];
        long right[] = new long[nums.length+1];
        long sum1 = 0;
        long sum2 = 0;
        for (int i = 0,j = nums.length-1;i<nums.length;i++,j--){
            sum1 += nums[i];
            sum2 += nums[j];
            left[i] = sum1/(i+1);
            right[j] = sum2/(i+1);
        }
        long min = Math.abs(left[0]-right[1]);
        int Indexmin = 0;
        for (int i = 0;i<left.length;i++){
            if (Math.abs(left[i]-right[i+1])<min){
                min = Math.abs(left[i]-right[i+1]);
                Indexmin = i;
            }
        }

        return Indexmin;

    }
}
