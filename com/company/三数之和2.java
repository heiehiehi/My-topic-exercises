package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 三数之和2 {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(nums);
        for (List i:ans){
            for (Object j:i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length < 3){
            return ans;
        }
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }
            if (nums[i]>0){
                break;
            }
            int left = i+1;
            int right = nums.length-1;
            int target = -nums[i];
            while (left<right){
                int sum = nums[left]+nums[right];
                if (sum==target){
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[left]);
                    res.add(nums[right]);
                    ans.add(res);
                    while (left<right&&nums[left]==nums[left+1]){
                        left++;
                    }
                    while (left<right&&nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                else if (sum<target){
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return ans;
    }
}
