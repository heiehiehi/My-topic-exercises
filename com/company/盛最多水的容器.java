package com.company;

public class 盛最多水的容器 {
    public static void main(String[] args) {
        int nums[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
    public static int maxArea(int[] height) {
//        int DP[] = new int[height.length];
//        DP[0] = 0;
//        int max = 0;
//        for (int i = 1;i< height.length;i++){
//            int nowmax = 0;
//            for (int j = i-1;j>=0;j--){
//                if ((i-j)*Math.min(height[i],height[j])>nowmax){
//                    nowmax = (i-j)*Math.min(height[i],height[j]);
//                }
//            }
//            if (nowmax>max){
//                max = nowmax;
//            }
//        }
//        return max;
        //双指针思路
        int left = 0;
        int right = height.length-1;
        int max = 0;
        int res = 0;
        while (left<right){
            int borad = right-left;
            res = borad*Math.min(height[right],height[left]);
            if (res>max){
                max = res;
            }
            if (height[left]>height[right]){
                right--;
            }
            else {
                left++;
            }
        }
        return max;
    }
}
