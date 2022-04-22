package com.company;

public class 岛屿数量 {
    public static void main(String[] args) {
        char grid[][] = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(numIslands(grid));
    }
    public static int numIslands(char[][] grid) {
        int biaoji[][] = new int[grid.length][grid[0].length];
        int count = 0;
        for (int i = 0;i<grid.length;i++){
            for (int j = 0;j<grid[0].length;j++){
                if(biaoji[i][j] == 0){
                    if (grid[i][j]=='1'){
                        helper(biaoji,i,j,grid);
                        count++;
                    }
                    else {
                        biaoji[i][j] = 1;
                    }
                }
            }
        }
        return count;
    }
    public static void helper(int bijiao[][],int x,int y,char grid[][]){
        if (x<0||x>=grid.length||y<0||y>=grid[0].length||bijiao[x][y]==1){
            return;
        }

        bijiao[x][y] = 1;//将bijiao对应的下标改为1
        if (grid[x][y]=='0'){
            return;
        }
        else {
            helper(bijiao,x+1,y,grid);
            helper(bijiao,x-1,y,grid);
            helper(bijiao,x,y+1,grid);
            helper(bijiao,x,y-1,grid);
        }
    }
}
