package com.company;

import java.util.Arrays;

public class 除自身以外数组的乘积 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int left[] = new int[nums.length];
        left[0] = nums[0];
        int right[] = new int[nums.length];
        right[nums.length-1] = nums[nums.length-1];
        for (int i = 1;i<=nums.length-1;i++){
            left[i] = left[i-1]*nums[i];
            right[nums.length-1-i] = right[nums.length-i]*nums[nums.length-1-i];
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        ans[0] = right[1];
        ans[nums.length-1] = left[nums.length-2];
        for (int i = 1;i<nums.length-1;i++){
            ans[i] = right[i+1]*left[i-1];
        }

        return ans;
    }
}
