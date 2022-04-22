package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class 前K个高频元素 {
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(nums,2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> dict = new HashMap<>();
        for (int i = 0;i<nums.length;i++){
            dict.put(nums[i],dict.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->b[1]-a[1]);//优先级，b[1]-a[1]优先级，说明b大于a
        //最大堆的用法
        for (int key:dict.keySet()){    //  遍历dict的方法
            queue.add(new int[]{key,dict.get(key)});
        }

        int ans[] = new int[k];
        for (int i = 0;i<k;i++){
            ans[i] = queue.poll()[0];
        }
        return ans;
    }
}
