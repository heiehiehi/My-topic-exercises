package com.company;

import java.util.*;

public class 合并区间 {
    public static void main(String[] args) {
        int arr[][] = {{1,4},{2,3}};
        int ans[][] = merge(arr);
        for(int i = 0;i<ans.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 1){
            return intervals;
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int biaoji[][] = new int[intervals.length][intervals[0].length];
        int count = intervals.length*intervals[0].length;
        Queue<Integer> chun = new LinkedList<>();
        for (int i = 0;i<intervals.length-1;i++){
            if (intervals[i][1]>intervals[i+1][1]){
                int temp = intervals[i][1];
                intervals[i][1] = intervals[i+1][1];
                intervals[i+1][1] = temp;
            }
            if (intervals[i][1]>intervals[i+1][0]){
                biaoji[i][1] = 1;
                biaoji[i+1][0] = 1;
                count-=2;
            }
        }
        for (int i = 0;i<biaoji.length;i++){
            for (int j = 0;j<biaoji[0].length;j++){
                if (biaoji[i][j]==0){
                    chun.add(intervals[i][j]);
                }
            }
        }

        int ans[][] = new int[count/2][2];
        for (int i = 0;i<ans.length;i++){
            for (int j = 0;j<ans[0].length;j++){
                ans[i][j] = chun.poll();
            }
        }
        return ans;

    }
}
