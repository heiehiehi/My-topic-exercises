package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class 单词搜索 {
    public static void main(String[] args) {
        char board[][] = {{'A','B','C','E'}
                        ,{'S','F','E','S'},
                        {'A','D','E','E'}};
        String word = "ABCESEEEFS";
        System.out.println(exist(board,word));
    }
    static boolean flag = false;
    public static boolean exist(char[][] board, String word) {
        flag = false;
        for (int i = 0;i<board.length;i++){
            for (int j = 0;j<board[0].length;j++){
                boolean biao[][] = new boolean[board.length][board[0].length];
                helper(board,word,0,i,j,biao);
                if (flag){
                    return flag;
                }

            }
        }
        return flag;
    }
    public static void helper(char[][] board,String word,int now,int x,int y,boolean biao[][]){
        if (x<0||x>=board.length||y<0||y>=board[0].length||biao[x][y]==true){
            return;
        }
        if (board[x][y]==word.charAt(now)){
            boolean newbiao[][] = new boolean[biao.length][biao[0].length];
            for (int i = 0;i<board.length;i++){
                for (int j = 0;j<board[0].length;j++){
                    newbiao[i][j] = biao[i][j];
                }
            }
            newbiao[x][y] = true;
            if (now+1 == word.length()){
                flag = true;
                return;
            }
            helper(board,word,now+1,x+1,y,newbiao);
            helper(board,word,now+1,x-1,y,newbiao);
            helper(board,word,now+1,x,y+1,newbiao);
            helper(board,word,now+1,x,y-1,newbiao);
        }
        else {
            return;
        }
    }
}
