package com.company;

public class 寻找重复数 {
    public static void main(String[] args) {
        int nums[] = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        int get = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[Math.abs(nums[i])-1] > 0){
                nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
            }
            else {
                get = nums[i];
            }
        }
        for (int i = 0;i<nums.length;i++){
            if (nums[i] < 0){
                nums[i] = Math.abs(nums[i]);
            }
        }
        return Math.abs(get);
    }
}
