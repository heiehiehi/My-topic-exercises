package 代码随想录;

public class 解数独 {
    public static void main(String[] args) {

    }
    public void solveSudoku(char[][] board) {
        backtracking(board);
    }
    public boolean backtracking(char[][] board){
        for (int i = 0;i<board.length;i++){
            for (int j = 0;j<board.length;j++){
                if (board[i][j]!='.')continue;
                for (char k = '1';k<='9';k++){
                    if (isValid(i,j,k,board)){
                        board[i][j] = k;
                        if (backtracking(board))return true;
                        board[i][j] = '.';
                    }
                }
                return false;
            }
        }
        return true;
    }
    public boolean isValid(int row,int col,char val,char board[][]){
        //找当前行
        for (int i = 0;i<board.length;i++){
            if (board[row][i]==val)return false;
        }
        //当前列
        for (int i= 0;i<board.length;i++){
            if (board[i][col]==val)return false;
        }
        //当前格
        int startrow = (row/3)*3;
        int startcol = (col/3)*3;
        for (int i = startrow;i<startrow+3;i++){
            for (int j = startcol;j<startcol+3;j++){
                if (board[i][j]==val)return false;
            }
        }
        return true;
    }
}
