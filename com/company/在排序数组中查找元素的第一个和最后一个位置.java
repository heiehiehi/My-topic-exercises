package com.company;

import java.util.Arrays;

public class 在排序数组中查找元素的第一个和最后一个位置 {
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,8)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int start = -1;
        int count = 0;
        boolean flag = true;
        for (int i = 0;i<nums.length;i++){
            if (nums[i]==target||flag){
                if (nums[i]==target&&flag){
                    start = i;
                    flag = !flag;
                }
                else if (nums[i]==target&&!flag){
                    count++;
                }
            }
            else {
                break;
            }
        }
        int ans[] = {start,start+count};
        return ans;
    }
}
