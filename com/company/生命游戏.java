package com.company;

import java.util.Arrays;

public class 生命游戏 {
    public static void main(String[] args) {
        int board[][] = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife(board);
        for (int i = 0;i<board.length;i++){
            System.out.println(Arrays.toString(board[i]));
        }

    }
    public static void gameOfLife(int[][] board) {
        int newans[][] = new int[board.length][board[0].length];
        for (int i = 0;i<board.length;i++){
            for (int j = 0;j<board[i].length;j++){
                newans[i][j] = board[i][j];
            }
        }

        for (int i = 0;i<board.length;i++){
            for (int j = 0;j<board[i].length;j++){
                helper(newans,board,i,j);
            }
        }

    }
    public static void helper(int board[][],int newans[][],int x,int y){
        int count = 0;
        if (x+1<board.length && board[x+1][y]==1){
            count++;
        }
        if (x-1>=0 && board[x-1][y]==1){
            count++;
        }
        if (y+1<board[0].length && board[x][y+1]==1){
            count++;
        }
        if (y-1>=0 && board[x][y-1]==1){
            count++;
        }
        if (x+1<board.length && y+1<board[0].length && board[x+1][y+1] == 1 ){
            count++;
        }
        if (x+1<board.length && y-1>=0 && board[x+1][y-1] == 1 ){
            count++;
        }
        if (x-1>=0 && y+1<board[0].length && board[x-1][y+1] == 1 ){
            count++;
        }
        if (x-1>=0 && y-1>=0 && board[x-1][y-1] == 1 ){
            count++;
        }

        if (board[x][y] == 0){
            if (count==3){
                newans[x][y] = 1;
            }
        }
        else {
            if (!(count==3||count==2)){
                newans[x][y] = 0;
            }
        }
    }
}
