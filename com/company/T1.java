package com.company;

import java.util.Arrays;

public class T1 {
    public static void main(String[] args) {
        String matrix[] = {">>v",">>v","^<<"};
        //> 1
        //^ 2
        //< 3
        //v 4
        int start[] = {0,0};
        int end[] = {1,1};
        System.out.println(conveyorBelt(matrix,start,end));
    }
//    public static int getMinimumTime(int[] time, int[][] fruits, int limit) {
//        int count[] = new int[fruits.length];
//        int sum = 0;
//        for (int i = 0;i<fruits.length;i++){
//            if (fruits[i][1]%limit!=0){
//                count[i] = (fruits[i][1]/limit)+1;
//            }
//            else {
//                count[i] = (fruits[i][1]/limit);
//            }
//            sum += (time[fruits[i][0]]*count[i]);
//        }
//        System.out.println(Arrays.toString(count));
//        return sum;
//    }
    public static int conveyorBelt(String[] matrix, int[] start, int[] end) {
        int DP[][] = new int[matrix.length][matrix[0].length()];
        DP[start[0]][start[1]] = 1;


        helper(DP,start[0],start[1],matrix);
        for (int i = 0;i< DP.length;i++){
            System.out.println(Arrays.toString(DP[i]));
        }
        return DP[end[0]][end[1]]-1;
    }
    public static void helper(int DP[][],int i,int j,String[] matrix){
        int d = 0;
        if (matrix[i].charAt(j)=='>'){
            d = 1;
        }
        else if (matrix[i].charAt(j)=='^'){
            d = 2;
        }
        else if (matrix[i].charAt(j)=='<'){
            d = 3;
        }
        else if (matrix[i].charAt(j)=='v'){
            d = 4;
        }

        if (i+1< DP.length){
            int temp = DP[i][j];
            if (d!=4){
                temp++;
            }
            if (DP[i+1][j]>temp||DP[i+1][j]==0){
                DP[i+1][j] = temp;
                helper(DP,i+1,j,matrix);
            }
        }
        if (i-1>=0){
            int temp = DP[i][j];
            if (d!=2){
                temp++;
            }
            if (DP[i-1][j]>temp||DP[i-1][j]==0){
                DP[i-1][j] = temp;
                helper(DP,i-1,j,matrix);
            }
        }
        if (j+1<DP[0].length){
            int temp = DP[i][j];
            if (d!=1){
                temp++;
            }
            if (DP[i][j+1]>temp||DP[i][j+1]==0){
                DP[i][j+1] = temp;
                helper(DP,i,j+1,matrix);
            }
        }
        if (j-1>=0){
            int temp = DP[i][j];
            if (d!=3){
                temp++;
            }
            if (DP[i][j-1]>temp||DP[i][j-1]==0){
                DP[i][j-1] = temp;
                helper(DP,i,j-1,matrix);
            }
        }
    }
}
