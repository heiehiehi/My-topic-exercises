package com.company;

import java.util.Arrays;

public class 数组中的第K个最大元素 {
    public static void main(String[] args) {
        int arr[] = {2,1};
        System.out.println(findKthLargest(arr,2));
    }
    public static int findKthLargest(int[] nums, int k) {
        quicksort(nums,0,nums.length-1);
        return nums[nums.length-k];
    }
    public static void quicksort(int arr[],int left,int right){
        int l = left;
        int r = right;
        int mid = arr[(left+right)/2];
        int temp = 0;
        while (l<r){
            while (arr[l]<mid){
                l++;
            }
            while (arr[r]>mid){
                r--;
            }
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            if (l>=r){
                break;
            }
            if (arr[l]==mid){
                r--;
            }
            if (arr[r]==mid){
                l++;
            }
        }
        if (l==r){
            l++;
            r--;
        }
        if (left<r){
            quicksort(arr, left, r);
        }
        if (l<right){
            quicksort(arr,l,right);
        }
    }
}
