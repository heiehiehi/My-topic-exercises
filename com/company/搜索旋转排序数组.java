package com.company;

public class 搜索旋转排序数组 {
    public static void main(String[] args) {
       int nums[] = {1};
       int target = 0;
       System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int count = 0;
        if (target>nums[0]){
            int i = 0;
            while (target>=nums[i]&&count!=nums.length){
                if (target == nums[i]){
                    return i;
                }
                else {
                    i = (i+1)%nums.length;
                    count++;
                }
            }
        }
        else {
            int i = 0;
            while (target<=nums[i]&&count!=nums.length){
                if (target == nums[i]){
                    return i;
                }
                else {
                    if (i == 0){
                        i = nums.length-1;
                        count++;
                    }
                    else {
                        i--;
                        count++;
                    }
                }
            }
        }
        return -1;
    }
}
