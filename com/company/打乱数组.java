package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class 打乱数组 {
    public static void main(String[] args) {
        Solution(new int[]{1,2,3,4});

    }
    static int arr[];
    public static void Solution(int[] nums) {
        arr = nums;
    }

    public static int[] reset() {
        return arr;
    }

    public static int[] shuffle() {
        int ans[] = Arrays.copyOf(arr,arr.length);
        int temp;
        for (int i=0;i<ans.length;i++){
            int Lucker = new Random().nextInt(ans.length);
            if (i!=Lucker){
                temp = ans[i];
                ans[i] = ans[Lucker];
                ans[Lucker] = temp;
            }
        }
        return ans;
    }
}
