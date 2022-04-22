package com.company;

public class 跳跃游戏 {
    public static void main(String[] args) {
        int nums[] = {3,0,8,2,0,0,1};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        if (nums.length==1){
            return true;
        }
        int dp = 0;
        int temp;
        int now = 0;
        while (dp<nums.length-1) {
            if (nums[now] == 0){
                return false;
            }
            else {
                temp = now+1;
                for (int i = now+1;i<=now+nums[now]&&i<nums.length;i++){
                    if ((temp+nums[temp])<nums[i]+i){
                        temp = i;
                    }
                }
                now = temp;
                dp = now+nums[temp];
            }
        }
        return true;
    }
}
