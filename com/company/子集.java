package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 子集 {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        List<List<Integer>> ans = subsets(nums);
        for (List i:ans){
            System.out.println(i.toString());
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        helper(ans,nums,0,res);
        ans.add(res);
        return ans;
    }
    public static void helper(List<List<Integer>> ans,int nums[],int now,List<Integer> res){
        for (int i = now;i<nums.length;i++){
            List<Integer> temp = new ArrayList<>(res);
            temp.add(nums[i]);
            ans.add(temp);
            helper(ans,nums,i+1,temp);
        }
    }
}
