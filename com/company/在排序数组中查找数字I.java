package com.company;

public class 在排序数组中查找数字I {
    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int count = 0;
        for (int i = 0;i<nums.length;i++){
            if (target<nums[i]){
                break;
            }
            else if (target==nums[i]){
                count++;
            }
        }
        return count;
    }
}
