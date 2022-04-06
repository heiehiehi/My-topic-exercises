package com.company;

import java.util.*;

public class 找出数组 {
    public static void main(String[] args) {
        int arr[] = {1,1000,1,1000};
        List<Integer> ans = findKDistantIndices(arr,1000,4);
        for (Integer i:ans){
            System.out.println(i);
        }
    }
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> arr = new HashSet<Integer>();
        for (int i=0;i<nums.length;i++){
            if (nums[i]==key){
                int xiaobiao = i;
                for (int j=k;j>0;j--){
                   xiaobiao--;
                   if (xiaobiao>=0){
                        arr.add(xiaobiao);
                   }
                   else{
                       break;
                   }
                }

                arr.add(i);

                xiaobiao = i;
                for (int j=k;j>0;j--){
                    xiaobiao++;
                    if (xiaobiao< nums.length){
                        arr.add(xiaobiao);
                    }
                    else{
                        break;
                    }
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (Integer i:arr){
            ans.add(i);
        }
        Collections.sort(ans);
        return ans;
    }
}
