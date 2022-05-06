package 代码随想录;

import java.util.Arrays;

public class 礼物的最大价值 {
    public static void main(String[] args) {

    }
    public int maxValue(int[][] grid) {
        int DP[][] = new int[grid.length][grid[0].length];
        DP[0][0] = grid[0][0];
        for (int i = 1;i<grid.length;i++){
            DP[i][0] = DP[i-1][0]+grid[i][0];
        }
        for (int i = 1;i<grid[0].length;i++){
            DP[0][i] = DP[0][i-1]+grid[0][i-1];
        }
        for (int i = 0;i<grid.length;i++){
            System.out.println(Arrays.toString(DP[0]));
        }
        for (int i = 1;i<grid.length;i++){
            for (int j = 1;j<grid[0].length;j++){
                DP[i][j] = Math.max(DP[i-1][j],DP[i][j-1])+grid[i][j];
            }
        }
        return DP[grid.length-1][grid[0].length-1];
    }
}
