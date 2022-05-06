package 代码随想录;

import java.util.Arrays;

public class 螺旋矩阵DFS {
    public static void main(String[] args) {
        int ans[][] = generateMatrix(4);
        for (int i = 0;i<ans.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    public static int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        DFS(matrix,1,0,0,1);
        return matrix;
    }
    public static void DFS(int matrix[][],int now,int x,int y,int dir){
        matrix[x][y] = now;
        if (y+1<matrix[0].length&&matrix[x][y+1]==0&&dir==1){
            DFS(matrix,now+1,x,y+1,1);
        }
        else if (x+1<matrix.length&&matrix[x+1][y]==0&&dir==2){
            DFS(matrix,now+1,x+1,y,2);
        }
        else if (y-1>=0&&matrix[x][y-1]==0&&dir==3){
            DFS(matrix,now+1,x,y-1,3);
        }
        else if (x-1>=0&&matrix[x-1][y]==0&&dir==4){
            DFS(matrix,now+1,x-1,y,4);
        }
        else if (y+1<matrix[0].length&&matrix[x][y+1]==0){
            DFS(matrix,now+1,x,y+1,1);
        }
        else if (x+1<matrix.length&&matrix[x+1][y]==0){
            DFS(matrix,now+1,x+1,y,2);
        }
        else if (y-1>=0&&matrix[x][y-1]==0){
            DFS(matrix,now+1,x,y-1,3);
        }
        else if (x-1>=0&&matrix[x-1][y]==0){
            DFS(matrix,now+1,x-1,y,4);
        }
    }
}
