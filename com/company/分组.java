package com.company;

public class 分组 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(divideArray(arr));
    }
    public static boolean divideArray(int[] nums) {
        int N = nums.length/2;
        int count = 0;
        for (int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i]==nums[j]&&nums[i]!=-1){
                    nums[i]=-1;
                    nums[j]=-1;
                    count++;
                    break;
                }
            }
        }
        if (count == N){
            return true;
        }
        else{
            return false;
        }


    }
}
