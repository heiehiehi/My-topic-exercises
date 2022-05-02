package com.company;

import java.util.Arrays;

public class 统计网格图中没有被保卫的格子数 {
    public static void main(String[] args) {
        int guards[][] = {{0,0},{1,1},{2,3}};
        int walls[][] = {{0,1},{2,2},{1,4}};
        System.out.println(countUnguarded(4,6,guards,walls));
    }
    static int count = 0;
    public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int map[][] = new int[m][n];
        for (int i = 0;i<walls.length;i++){
            map[walls[i][0]][walls[i][1]] = 1;
        }
        for (int i = 0;i<guards.length;i++){
            map[guards[i][0]][guards[i][1]] = 2;
        }
        for (int i = 0;i<guards.length;i++){
                helper(map,guards[i][0]+1,guards[i][1],1);
                helper(map,guards[i][0],guards[i][1]+1,2);
                helper(map,guards[i][0]-1,guards[i][1],3);
                helper(map,guards[i][0],guards[i][1]-1,4);
        }
        count = count + walls.length + guards.length;
        for (int i = 0;i<map.length;i++){
            System.out.println(Arrays.toString(map[i]));
        }
        return m*n - count;
    }
    public static void helper(int map[][],int x,int y,int dir){
        if (isValid(map,x,y)){
            if (map[x][y]==0){
                map[x][y] = 3;
                count++;
            }
            else if (map[x][y]==1||map[x][y]==2){
                return;
            }
        }
        else {
            return;
        }
        if (dir==1){
            helper(map,x+1,y,1);
        }
        else if (dir == 2){
            helper(map,x,y+1,2);
        }
        else if (dir == 3){
            helper(map,x-1,y,3);
        }
        else if (dir == 4){
            helper(map,x,y-1,4);
        }
    }
    public static boolean isValid(int board[][],int x,int y){
        int m = board.length;
        int n = board[0].length;
        return x>=0 && x<m && y>=0 && y<n;
    }
}
