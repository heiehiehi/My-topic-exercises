package com.company;

public class 寻找峰值 {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(arr));
    }
    public static int findPeakElement(int[] nums) {
        int now = 0;
        for (int i = 1;i<nums.length-1;i++){
            if (nums[i-1]<nums[i]&&nums[i]>nums[i+1]){
                return i;
            }
        }
        if (nums[nums.length-1]>nums[0]){
            return nums.length-1;
        }
        else {
            return 0;
        }
    }
}
