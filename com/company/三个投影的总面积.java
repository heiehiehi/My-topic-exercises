package com.company;

public class 三个投影的总面积 {
    public static void main(String[] args) {
        int grid[][] = {{1,2},{3,4}};
        System.out.println(projectionArea(grid));
    }
    public static int projectionArea(int[][] grid) {
        //俯视图面积
        int sumf = 0;
        int sumz = 0;
        int sumc = 0;
        for (int i = 0;i<grid.length;i++){
            int max = 0;
            for (int j = 0;j<grid[i].length;j++){
                if (grid[i][j]!=0){
                    sumf++;
                }
                if (grid[i][j]>max){
                    max = grid[i][j];
                }
            }
            sumc+=max;
        }
        for (int i = 0;i<grid[0].length;i++){
            int max = 0;
            for (int j = 0;j<grid.length;j++){
                if (grid[j][i]>max){
                    max = grid[j][i];
                }
            }
            sumz += max;
        }
        return sumc+sumz+sumf;
    }
}
