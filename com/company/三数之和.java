package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 三数之和 {
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

        for (int i=0;i<nums.length-2;i++){
            if (nums[i]<=0){
                for (int j=i+1;j<nums.length-1;j++){
                    if (nums[i]+nums[j]<=0){
                        for (int k=j+1;k<nums.length;k++){
                                if (nums[i]+nums[j]+nums[k]==0){
                                    List<Integer> res = new ArrayList<>();
                                    res.add(nums[i]);
                                    res.add(nums[j]);
                                    res.add(nums[k]);
                                    if (ans.contains(res)){
                                        ans.add(res);
                                    }
                                    break;
                                }
                        }
                    }
                    else {
                        break;
                    }
                }
            }
            else {
                break;
            }
        }
        return ans;
    }
}
