package com.company;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 滑动窗口最大值 {
    public static void main(String[] args) {
        int nums[] = {7,2,4};
        int k = 2;
        System.out.println(Arrays.toString(maxSlidingWindow(nums,k)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> now = new PriorityQueue<>((a,b)->(b[1]-a[1]));
        for (int i = 0;i<k;i++){
            now.add(new int[]{i,nums[i]});
        }

        int max[] = new int[nums.length-k+1];
        max[0] = now.peek()[1];

        for (int i = 1;i<max.length;i++){
            now.add(new int[]{i+k-1,nums[i+k-1]});
            while(now.peek()[0]<i){
                now.poll();
            }
            max[i] = now.peek()[1];
        }

        return max;

    }
}
