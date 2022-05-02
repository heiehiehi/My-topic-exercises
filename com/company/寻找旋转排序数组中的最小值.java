package com.company;

public class 寻找旋转排序数组中的最小值 {
    public static void main(String[] args) {
        int nums[] = {2,1};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            int mid =left+((right-left)/2);
            if (nums[right]<nums[mid]){
                left = mid+1;
            }
            else if (nums[right]>nums[mid]){
                right = mid;
            }
            else {
                right--;
            }

        }
        return nums[left];
    }
}
