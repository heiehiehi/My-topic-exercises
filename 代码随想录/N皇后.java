package 代码随想录;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N皇后 {
    public static void main(String[] args) {
        solveNQueens(4);
    }
    static List<List<String>> result = new ArrayList<>();
    public static List<List<String>> solveNQueens(int n) {
        char broad[][] = new char[n][n];
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                broad[i][j] = '.';
            }
        }
        backtracking(broad,0);
        return result;
    }
    public static void backtracking(char[][] broad,int Depth){
        if (Depth == broad.length){
            List<String> res = new ArrayList<>();
            for (int i = 0;i<broad.length;i++){
                res.add(String.valueOf(broad[i]));
            }
            result.add(res);
            return;
        }
        for (int i = 0;i<broad.length;i++){
            if (isValid(broad,Depth,i)){
                broad[Depth][i] = 'Q';
                backtracking(broad,Depth+1);
                broad[Depth][i] = '.';
            }
        }
    }
    public static boolean isValid(char broad[][],int row,int col){
        //查看列是否有皇后
        for (int i = 0;i<row;i++){
            if (broad[i][col]=='Q')return false;
        }
        //查看45度
        for (int i = row-1,j = col-1;i>=0&&j>=0;i--,j--){
            if (broad[i][j]=='Q')return false;
        }
        //查看135度
        for (int i = row-1,j = col+1;i>=0&&j<broad.length;i--,j++){
            if (broad[i][j]=='Q')return false;
        }
        return true;
    }
}
