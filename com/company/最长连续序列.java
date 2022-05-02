package com.company;

public class 最长连续序列 {
    public static void main(String[] args) {
        int nums[] = {9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        quicksort(nums,0,nums.length-1);
        int max = 1;
        int count = 1;
        for (int i = 1;i<nums.length;i++){
            if (nums[i]!=nums[i-1]&&nums[i]-nums[i-1]!=1){
                if (count>max){
                    max = count;
                }
                count = 1;
            }
            else if (nums[i]==nums[i-1]){
                continue;
            }
            else {
                count++;
            }
        }
        if (count>max){
            max = count;
        }
        return max;
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
            temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;

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
            r--;
            l++;
        }
        if (left<r){
            quicksort(arr, left, r);
        }
        if (right>l){
            quicksort(arr, l, right);
        }
    }
}
