package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;

public class 全排列 {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        List<List<Integer>> ans = permute(nums);
        for (List i:ans){
            System.out.println(i.toString());
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,ans);
        return ans;
    }
    public static void helper(int nums[],int now,List<List<Integer>> ans){
        if (now == nums.length){
            List<Integer> res = new ArrayList<>();
            for (int i = 0;i<nums.length;i++){
                res.add(nums[i]);
            }
            ans.add(res);
            return;
        }
        for (int i = now;i<nums.length;i++){
            int temp = nums[now];
            nums[now] = nums[i];
            nums[i] = temp;

            helper(nums,now+1,ans);

            temp = nums[now];
            nums[now] = nums[i];
            nums[i] = temp;
        }
    }

}
