package com.company;

import java.util.Arrays;

public class 矩阵置零 {
    public static void main(String[] args) {
        int matrix[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        int M = matrix.length;
        int N = matrix[0].length;
        for (int i = 0;i<M;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public static void setZeroes(int[][] matrix) {
        int row[] = new int[matrix.length];
        int col[] = new int[matrix[0].length];

        int M = matrix.length;
        int N = matrix[0].length;
        for (int i = 0;i<M;i++){
            for (int j = 0;j<N;j++){
                if (matrix[i][j]==0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        //row行清零
        for(int i = 0;i<row.length;i++){
            if (row[i]==1){
                for (int j = 0;j<N;j++){
                    matrix[i][j] = 0;
                }
            }
        }
        //col列清零
        for(int i = 0;i<col.length;i++){
            if (col[i]==1){
                for (int j = 0;j<M;j++){
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
