package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 多个数组求交集 {
    public static void main(String[] args) {
        int arr[][] = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        System.out.println(intersection(arr).toString());
    }
    public static List<Integer> intersection(int[][] nums) {
        List<Integer> get = new ArrayList<>();
        for (int i = 0;i<nums[0].length;i++){
            get.add(nums[0][i]);
        }
        for (int j = 1;j<nums.length;j++){
            List<Integer> temp = new ArrayList<>();
            for (int k = 0;k<nums[j].length;k++){
                if (get.contains(nums[j][k])){
                    temp.add(nums[j][k]);
                }
            }
            get = temp;
        }
        Collections.sort(get);
        return get;
    }
}
