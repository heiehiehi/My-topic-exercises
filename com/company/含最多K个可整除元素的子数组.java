package com.company;

import java.util.*;

public class 含最多K个可整除元素的子数组 {
    public static void main(String[] args) {
        int nums[] = {2,3,3,2,2};
        int k = 2, p = 2;
        System.out.println(countDistinct(nums,k,p));
    }
    public static int countDistinct(int[] nums, int k, int p) {
        int count = 0;
        int DP[] = new int[nums.length];
        HashSet<List<Integer>> ans = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        int start = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]%p==0){
                if (queue.size()>=k){
                    start = queue.poll()+1;
                }
                queue.add(i);
            }
            for (int j = i;j>=start;j--){
                List<Integer> res = new ArrayList<>();
                for (int m = j;m<=i;m++){
                    res.add(nums[m]);
                }
                if (!ans.contains(res)){
                    ans.add(res);
                    System.out.println(res.toString());
                }
            }
        }
        return ans.size();
    }
}
