package com.company;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 减少一半2 {
    public static void main(String[] args) {
        int arr[] = {5,19,8,1};
        halveArray(arr);
    }
    public static int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<Double>((a, b) -> b - a > 0 ? 1 : -1);
        double get = 0;
        for (int i=0;i<nums.length;i++){
            get+=(double) nums[i];
            pq.add((double)nums[i]);
        }
        int ans = 0;
        double sum = 0;
        while (sum<get/2){
            double t = pq.poll();
            sum+=t/2;
            pq.add(t/2);
            ans++;
        }

        return ans;
    }
}
