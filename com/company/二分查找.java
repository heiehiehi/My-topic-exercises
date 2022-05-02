package com.company;

public class 二分查找 {
    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums,target));
    }
    //左闭右闭
//    public static int search(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length-1;
//        int mid;
//        while (left<=right){
//            mid = left+((right-left)/2);
//            if (nums[mid] == target){
//                return mid;
//            }
//            else if (nums[mid] > target){
//                right = mid - 1;
//            }
//            else if (nums[mid] < target){
//                left = mid + 1;
//            }
//        }
//        return -1;
//    }
    //左闭右开
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int mid;
        while (left<right){
            mid = left+((right-left)/2);
            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] > target){
                right = mid;
            }
            else if (nums[mid] < target){
                left = mid + 1;
            }
        }
        return -1;
    }
}
