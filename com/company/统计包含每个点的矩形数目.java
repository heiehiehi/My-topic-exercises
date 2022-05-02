package com.company;

import java.util.Arrays;

public class 统计包含每个点的矩形数目 {
    public static void main(String[] args) {
        int arr[][] = {{1,2},{2,3},{2,5}};
        int points[][] = {{2,1},{1,4}};

        System.out.println(Arrays.toString(countRectangles(arr,points)));
    }
    public static int[] countRectangles(int[][] rectangles, int[][] points) {
        int pointcount[] = new int[points.length];
        Arrays.sort(rectangles,(a,b)->((a[0]+a[1]))-(b[0]+b[1]));
        for (int i = 0;i<points.length;i++){
            System.out.println(Arrays.toString(rectangles[i]));
        }

        int DP[] = new int[rectangles.length];
        for (int i = 0;i<rectangles.length;i++){
            int now = 0;
            for (int j = i-1;j>=rectangles.length;j--){
                if (rectangles[i][0]>=rectangles[j][0]&&rectangles[i][1]>=rectangles[j][1]){
                    now = DP[j];
                    break;
                }
            }
            for (int j = now;j<points.length;j++){
                if (rectangles[i][0]>=points[j][0]&&rectangles[i][1]>=points[j][1]){
                    now++;
                }
            }
            DP[i] = now;
        }
        return DP;
    }
}
