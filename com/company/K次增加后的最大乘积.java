//package com.company;
//
//public class K次增加后的最大乘积 {
//    public static void main(String[] args) {
//        public int maximumProduct(int[] nums, int k) {
//
//            int sp = 0;
//            for (int i = 0;i<nums.length-1;i++){
//                if (nums[i]<nums[i+1]){
//                    sp=0;
//                }
//                while(nums[i]<nums[i+1]&&k>0){
//                    nums[sp]++;
//                    if (sp+1<i+1){
//                        sp++;
//                    }
//                    else if(sp+1==i+1){
//                        sp=0;
//                    }
//
//                    k--;
//                }
//
//                if (k==0){
//                    break;
//                }
//            }
//            int i = 0;
//            int length = nums.length;
//            while(k>0){
//                nums[i]++;
//                i = (i+1)%length;
//                k--;
//            }
//            int ans = nums[0];
//            for (int j = 1;j<nums.length;j++){
//                ans = (ans*nums[j])%1000000007;
//            }
//
//            return ans;
//    }
//}
