package com.company;

public class 乘积小于k的子数组 {
    public static void main(String[] args) {

    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int len = nums.length;
        if(k<=1){
            return 0;
        }
        int j = 0;
        int sum = 1;
        int ans = 0;
        for (int i = 0;i<len;i++){
            sum*=nums[i];
            while (sum>=k){
                sum/=nums[j++];
            }
            ans += i-j+1;
        }
        return ans;
    }
}
