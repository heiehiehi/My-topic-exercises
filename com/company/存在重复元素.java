package com.company;

import java.util.Arrays;
import java.util.Collections;

public class 存在重复元素 {
    public static void Quicksort(int arr[],int left,int right) {
        int l = left;
        int r = right;
        int pivot = arr[(left+right)/2];
        int temp =0;
        while(l<r) {
            while(arr[l]<pivot) {
                l++;
            }
            while(arr[r]>pivot) {
                r--;
            }
            temp = arr[l];
            arr[l] = arr[r];
            arr[r]=temp;

            if(l>=r) {
                break;
            }

            if(arr[l]==pivot) {
                r--;
            }
            if(arr[r]==pivot) {
                l++;
            }
        }
        if(l==r) {
            r--;
            l++;
        }
        if(left<r) {
            Quicksort(arr,left,r);
        }
        if(right>l) {
            Quicksort(arr,l,right);
        }

    }
    public static void main(String[] args) {
        int nums[] = {101,34,119,1,55,33,2,8,5};
        int temp;
        Quicksort(nums,0,nums.length-1);

        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]){
                System.out.println(true);
            }
        }
        System.out.println(false);
    }
}
