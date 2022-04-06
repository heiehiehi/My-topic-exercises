package com.company;

import java.util.Arrays;

public class 有效数独 {
    public static void main(String[] args) {
        char board[][] = {   {'5','3','.','.','7','.','.','.','.'}
                            ,{'6','.','.','1','9','5','.','.','.'}
                            ,{'.','9','8','.','.','.','.','6','.'}
                            ,{'8','.','.','.','6','.','.','.','3'}
                            ,{'4','.','.','8','.','3','.','.','1'}
                            ,{'7','.','.','.','2','.','.','.','6'}
                            ,{'.','6','.','.','.','.','2','8','.'}
                            ,{'.','.','.','4','1','9','.','.','5'}
                            ,{'.','.','.','.','8','.','.','7','9'}};

        boolean ans = true;
        //行检测
        int jiance[] = new int[10];
        for (int i = 0;i<9;i++){
            for (int j = 0;j<9;j++){
                if (board[i][j]!='.'){
                    int now = board[i][j] - '0';
                    jiance[now]++;
                };
            }
            for (int n = 0;n<10;n++){
                if (jiance[n]>1){
                    ans = false;
                    break;
                }
                jiance[n] = 0;
            }
        }
        if (ans){
            //列检测
            for (int i = 0;i<9;i++){
                for (int j = 0;j<9;j++){
                    if (board[j][i]!='.'){
                        int now = board[j][i] - '0';
                        jiance[now]++;
                    };
                }
                for (int n = 0;n<10;n++){
                    if (jiance[n]>1){
                        ans = false;
                        break;
                    }
                    jiance[n] = 0;
                }
            }
        }
        if (ans){
            //格检测
            for (int m = 1;m<=3;m++){
                for (int n = 1;n<=3;n++){
                    for (int i = (m-1)*3;i<m*3;i++){
                        for (int j = (n-1)*3;j<n*3;j++){
                            if (board[i][j]!='.'){
                                int now = board[i][j] - '0';
                                jiance[now]++;
                            };
                        }
                    }
                    for (int c = 0;c<10;c++){
                        if (jiance[c]>1){
                            ans = false;
                            break;
                        }
                        jiance[c] = 0;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
