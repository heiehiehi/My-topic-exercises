package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 太平洋 {
    public static void main(String[] args) {
        int heights[][] = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        List<List<Integer>> ans = pacificAtlantic(heights);
        for (List<Integer> i:ans){
            System.out.println(ans.toString());
        }
    }
    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        int DP[][] = new int[heights.length][heights[0].length];
        for (int i = 0;i<heights[0].length;i++){
            DPS(DP,0,i,heights,1);
            DPS(DP,heights.length-1,i,heights,2);
        }
        for (int i = 0;i<heights.length;i++){
            DPS(DP,i,0,heights,1);
            DPS(DP,i,heights[0].length-1,heights,2);
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0;i<heights.length;i++){
            for (int j = 0;j<heights[i].length;j++){
                if (DP[i][j]==3){
                    List<Integer> res = new ArrayList<>();
                    res.add(i);
                    res.add(j);
                    ans.add(res);
                }
            }
        }

        return ans;
    }
    public static void DPS(int DP[][],int x,int y,int heights[][],int ding){
        if (ding==DP[x][y]||DP[x][y]==3){
            return;
        }
        if (ding == 2){
            if (DP[x][y]==1||DP[x][y]==3){
                DP[x][y] = 3;
            }
            else {
                DP[x][y] = ding;
            }
        }
        else if (ding == 1){
            if (DP[x][y]==2||DP[x][y]==3){
                DP[x][y] = 3;
            }
            else {
                DP[x][y] = ding;
            }
        }

        if (x-1>=0){
            if (heights[x-1][y]>=heights[x][y]){
                DPS(DP,x-1,y,heights,ding);
            }
        }
        if (y-1>=0){
            if (heights[x][y-1]>=heights[x][y]){
                DPS(DP,x,y-1,heights,ding);
            }
        }
        if (x+1<heights.length){
            if (heights[x+1][y]>=heights[x][y]){
                DPS(DP,x+1,y,heights,ding);
            }
        }
        if (y+1<heights[0].length){
            if (heights[x][y+1]>=heights[x][y]){
                DPS(DP,x,y+1,heights,ding);
            }
        }
    }
}
