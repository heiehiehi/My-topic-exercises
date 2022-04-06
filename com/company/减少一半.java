package com.company;

import java.util.Arrays;

public class 减少一半 {
    public static void main(String[] args) {
        int arr[] = {6,58,10,84,35,8,22,64,1,78,86,71,77};
        halveArray(arr);
    }
    public static int halveArray(int[] nums) {
        int arr[] = new int[nums.length];
        double nums2[] = new double[nums.length];
        int get = 0;
        for (int i=0;i<nums.length;i++){
            arr[i] = i;
            nums2[i]=nums[i]+0.0;
            get+=nums[i];
        }
//        for (int i = 0;i<nums.length;i++){
//            for (int j=i+1;j<nums.length;j++){
//                if (nums2[i]<nums2[j]){
//                    double t = nums2[i];
//                    nums2[i]=nums2[j];
//                    nums2[j]=t;
//                    int g = arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=g;
//                }
//            }
//        }
//        System.out.println(get);
//        int sum = 0;
//        int ans = 0;
//        while (sum<get/2.0){
//            sum+=nums2[0]/2.0;
//            nums2[0]=nums2[0]/2.0;
//            ans++;
//            for (int i = 0;i<nums.length;i++){
//                for (int j=i+1;j<nums.length;j++){
//                    if (nums2[i]<nums2[j]){
//                        double t = nums2[i];
//                        nums2[i]=nums2[j];
//                        nums2[j]=t;
//                        int g = arr[i];
//                        arr[i]=arr[j];
//                        arr[j]=g;
//                    }
//                }
//            }
//        }
//
//        for (int i = 0;i<nums.length;i++){
//            for (int j=i+1;j<nums.length;j++){
//                if (arr[i]>arr[j]){
//                    double t = nums2[i];
//                    nums2[i]=nums2[j];
//                    nums2[j]=t;
//                    int g = arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=g;
//                }
//            }
//        }
        double sum = 0;
        int ans = 0;
        while(sum<get/2.0){
            int max = 0;
            for (int i=0;i<nums2.length;i++){
                if (nums2[max]<nums2[i]){
                    max=i;
                }
            }
            nums2[max]=(nums2[max]/2.0);
            sum+=nums2[max];
            ans++;
        }
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nums2));
        return ans;
    }
}
