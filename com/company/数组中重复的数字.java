package com.company;

public class 数组中重复的数字 {
    public static void main(String[] args) {
        int nums[] = {2,3,1,0,2,5,3};
        System.out.println(findRepeatNumber(nums));
    }
    public static int findRepeatNumber(int[] nums) {
        int arr[] = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
            if (arr[nums[i]]==1){
                return nums[i];
            }
            else {
                arr[nums[i]] = 1;
            }
        }
        return 0;
    }
}
