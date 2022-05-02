package com.company;

public class 缺失的数字 {
    public static void main(String[] args) {
        int nums[] = {0,1,2,3,4,5,6,7,9};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (right+left)/2;
            if (nums[mid]!=mid){
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return left;
    }
}
