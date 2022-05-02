package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 螺旋矩阵 {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(spiralOrder(matrix).toString());
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int DP[][] = new int[matrix.length][matrix[0].length];
        List<Integer> ans = new ArrayList<>();
        DP[0][0] = 1;
        helper(DP,matrix,0,0,ans,1);
        return ans;
    }
    public static void helper(int DP[][],int matrix[][],int x,int y,List<Integer> ans,int panduan){
        ans.add(matrix[x][y]);
        if (panduan!=0){
            if (y+1<DP[0].length&&DP[x][y+1]==0&&panduan==1){
                DP[x][y+1] = 1;
                helper(DP,matrix,x,y+1,ans,1);
            }
            else if (x+1<DP.length&&DP[x+1][y]==0&&panduan==2){
                DP[x+1][y] = 1;
                helper(DP,matrix,x+1,y,ans,2);
            }
            else if (y-1>=0&&DP[x][y-1]==0&&panduan==3){
                DP[x][y-1] = 1;
                helper(DP,matrix,x,y-1,ans,3);
            }
            else if (x-1>=0&&DP[x-1][y]==0&&panduan==4){
                DP[x-1][y] = 1;
                helper(DP,matrix,x-1,y,ans,4);
            }
        }

        if (y+1<DP[0].length&&DP[x][y+1]==0){
            DP[x][y+1] = 1;
            helper(DP,matrix,x,y+1,ans,1);
        }
        else if (x+1<DP.length&&DP[x+1][y]==0){
            DP[x+1][y] = 1;
            helper(DP,matrix,x+1,y,ans,2);
        }
        else if (y-1>=0&&DP[x][y-1]==0){
            DP[x][y-1] = 1;
            helper(DP,matrix,x,y-1,ans,3);
        }
        else if (x-1>=0&&DP[x-1][y]==0){
            DP[x-1][y] = 1;
            helper(DP,matrix,x-1,y,ans,4);
        }
    }
}
