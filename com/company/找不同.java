package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class 找不同 {
    public static void main(String[] args) {
        int nums1[] = {1,2,3};
        int nums2[] = {2,4,6};
        findDifference(nums1,nums2);
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int n1[] = new int[nums1.length];
        int n2[] = new int[nums2.length];
        for (int i = 0;i< n2.length;i++){
            for (int j =0;j<n1.length;j++){
                if (nums2[i]==nums1[j]){
                    n1[j] = 1;
                    n2[i] = 1;
                }
            }
        }
        for (int i = 0;i<n1.length;i++){
            if (n1[i] == 0){
                set.add(nums1[i]);
            }
        }
        for (int i = 0;i<n2.length;i++){
            if (n2[i] == 0){
                set2.add(nums2[i]);
            }
        }
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        for (Integer i:set){
            ans1.add(i);
        }
        for (Integer i:set2){
            ans2.add(i);
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(ans1);
        ans.add(ans2);
        return ans;
    }
}
