package com.company;

import java.util.Arrays;

public class T2 {
//    public static void main(String[] args) {
//        String matrix[] = {">^^>","<^v>","^v^<"};
//        //> 1
//        //^ 2
//        //< 3
//        //v 4
//        int start[] = {0,0};
//        int end[] = {0,0};
//        System.out.println(conveyorBelt(matrix,start,end));
//    }
//    public static int conveyorBelt(String[] matrix, int[] start, int[] end) {
//        int DP[][] = new int[matrix.length][matrix[0].length()];
//        DP[start[0]][start[1]] = 1;
//        for (int i = start[0];i<matrix.length;i++){
//            for (int j=start[1];j<matrix[0].length();j++){
//                int d = 0;
//                if (matrix[i].charAt(j)=='>'){
//                    d = 1;
//                }
//                else if (matrix[i].charAt(j)=='^'){
//                    d = 2;
//                }
//                else if (matrix[i].charAt(j)=='<'){
//                    d = 3;
//                }
//                else if (matrix[i].charAt(j)=='v'){
//                    d = 4;
//                }
//
//                if (i+1< DP.length){
//                    int temp = DP[i][j];
//                    if (d!=4){
//                        temp++;
//                    }
//                    if (DP[i+1][j]>temp||DP[i+1][j]==0){
//                        DP[i+1][j] = temp;
//                    }
//                }
//                if (i-1>=0){
//                    int temp = DP[i][j];
//                    if (d!=2){
//                        temp++;
//                    }
//                    if (DP[i-1][j]>temp||DP[i-1][j]==0){
//                        DP[i-1][j] = temp;
//                    }
//                }
//                if (j+1<DP[0].length){
//                    int temp = DP[i][j];
//                    if (d!=1){
//                        temp++;
//                    }
//                    if (DP[i][j+1]>temp||DP[i][j+1]==0){
//                        DP[i][j+1] = temp;
//                    }
//                }
//                if (j-1>=0){
//                    int temp = DP[i][j];
//                    if (d!=3){
//                        temp++;
//                    }
//                    if (DP[i][j-1]>temp||DP[i][j-1]==0){
//                        DP[i][j-1] = temp;
//                    }
//                }
//            }
//        }
//
//        for (int i = matrix.length-1;i>=0;i--){
//            for (int j = matrix[0].length()-1;j>=0;j--){
//                int d = 0;
//                if (matrix[i].charAt(j)=='>'){
//                    d = 1;
//                }
//                else if (matrix[i].charAt(j)=='^'){
//                    d = 2;
//                }
//                else if (matrix[i].charAt(j)=='<'){
//                    d = 3;
//                }
//                else if (matrix[i].charAt(j)=='v'){
//                    d = 4;
//                }
//
//                if (i+1< DP.length){
//                    int temp = DP[i][j];
//                    if (d!=4){
//                        temp++;
//                    }
//                    if (DP[i+1][j]>temp||DP[i+1][j]==0){
//                        DP[i+1][j] = temp;
//                    }
//                }
//                if (i-1>=0){
//                    int temp = DP[i][j];
//                    if (d!=2){
//                        temp++;
//                    }
//                    if (DP[i-1][j]>temp||DP[i-1][j]==0){
//                        DP[i-1][j] = temp;
//                    }
//                }
//                if (j+1<DP[0].length){
//                    int temp = DP[i][j];
//                    if (d!=1){
//                        temp++;
//                    }
//                    if (DP[i][j+1]>temp||DP[i][j+1]==0){
//                        DP[i][j+1] = temp;
//                    }
//                }
//                if (j-1>=0){
//                    int temp = DP[i][j];
//                    if (d!=3){
//                        temp++;
//                    }
//                    if (DP[i][j-1]>temp||DP[i][j-1]==0){
//                        DP[i][j-1] = temp;
//                    }
//                }
//            }
//        }
//
//        for (int i = 0;i<matrix.length;i++){
//            for (int j=0;j<matrix[0].length();j++){
//                int d = 0;
//                if (matrix[i].charAt(j)=='>'){
//                    d = 1;
//                }
//                else if (matrix[i].charAt(j)=='^'){
//                    d = 2;
//                }
//                else if (matrix[i].charAt(j)=='<'){
//                    d = 3;
//                }
//                else if (matrix[i].charAt(j)=='v'){
//                    d = 4;
//                }
//
//                if (i+1< DP.length){
//                    int temp = DP[i][j];
//                    if (d!=4){
//                        temp++;
//                    }
//                    if (DP[i+1][j]>temp||DP[i+1][j]==0){
//                        DP[i+1][j] = temp;
//                    }
//                }
//                if (i-1>=0){
//                    int temp = DP[i][j];
//                    if (d!=2){
//                        temp++;
//                    }
//                    if (DP[i-1][j]>temp||DP[i-1][j]==0){
//                        DP[i-1][j] = temp;
//                    }
//                }
//                if (j+1<DP[0].length){
//                    int temp = DP[i][j];
//                    if (d!=1){
//                        temp++;
//                    }
//                    if (DP[i][j+1]>temp||DP[i][j+1]==0){
//                        DP[i][j+1] = temp;
//                    }
//                }
//                if (j-1>=0){
//                    int temp = DP[i][j];
//                    if (d!=3){
//                        temp++;
//                    }
//                    if (DP[i][j-1]>temp||DP[i][j-1]==0){
//                        DP[i][j-1] = temp;
//                    }
//                }
//            }
//        }
//
//        for (int j=0;j<matrix[0].length();j++){
//            for (int i = 0;i<matrix.length;i++){
//                int d = 0;
//                if (matrix[i].charAt(j)=='>'){
//                    d = 1;
//                }
//                else if (matrix[i].charAt(j)=='^'){
//                    d = 2;
//                }
//                else if (matrix[i].charAt(j)=='<'){
//                    d = 3;
//                }
//                else if (matrix[i].charAt(j)=='v'){
//                    d = 4;
//                }
//
//                if (i+1< DP.length){
//                    int temp = DP[i][j];
//                    if (d!=4){
//                        temp++;
//                    }
//                    if (DP[i+1][j]>temp||DP[i+1][j]==0){
//                        DP[i+1][j] = temp;
//                    }
//                }
//                if (i-1>=0){
//                    int temp = DP[i][j];
//                    if (d!=2){
//                        temp++;
//                    }
//                    if (DP[i-1][j]>temp||DP[i-1][j]==0){
//                        DP[i-1][j] = temp;
//                    }
//                }
//                if (j+1<DP[0].length){
//                    int temp = DP[i][j];
//                    if (d!=1){
//                        temp++;
//                    }
//                    if (DP[i][j+1]>temp||DP[i][j+1]==0){
//                        DP[i][j+1] = temp;
//                    }
//                }
//                if (j-1>=0){
//                    int temp = DP[i][j];
//                    if (d!=3){
//                        temp++;
//                    }
//                    if (DP[i][j-1]>temp||DP[i][j-1]==0){
//                        DP[i][j-1] = temp;
//                    }
//                }
//            }
//        }
//
//        for (int j=matrix[0].length()-1;j>=0;j--){
//            for (int i = matrix.length-1;i>=0;i--){
//                int d = 0;
//                if (matrix[i].charAt(j)=='>'){
//                    d = 1;
//                }
//                else if (matrix[i].charAt(j)=='^'){
//                    d = 2;
//                }
//                else if (matrix[i].charAt(j)=='<'){
//                    d = 3;
//                }
//                else if (matrix[i].charAt(j)=='v'){
//                    d = 4;
//                }
//
//                if (i+1< DP.length){
//                    int temp = DP[i][j];
//                    if (d!=4){
//                        temp++;
//                    }
//                    if (DP[i+1][j]>temp||DP[i+1][j]==0){
//                        DP[i+1][j] = temp;
//                    }
//                }
//                if (i-1>=0){
//                    int temp = DP[i][j];
//                    if (d!=2){
//                        temp++;
//                    }
//                    if (DP[i-1][j]>temp||DP[i-1][j]==0){
//                        DP[i-1][j] = temp;
//                    }
//                }
//                if (j+1<DP[0].length){
//                    int temp = DP[i][j];
//                    if (d!=1){
//                        temp++;
//                    }
//                    if (DP[i][j+1]>temp||DP[i][j+1]==0){
//                        DP[i][j+1] = temp;
//                    }
//                }
//                if (j-1>=0){
//                    int temp = DP[i][j];
//                    if (d!=3){
//                        temp++;
//                    }
//                    if (DP[i][j-1]>temp||DP[i][j-1]==0){
//                        DP[i][j-1] = temp;
//                    }
//                }
//            }
//        }
//
//
//        for (int i = 0;i< DP.length;i++){
//            System.out.println(Arrays.toString(DP[i]));
//        }
//        return DP[end[0]][end[1]]-1;
//    }
}
