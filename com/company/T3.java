package com.company;

import java.sql.Time;
import java.util.Arrays;

public class T3 {
    public static void main(String[] args) {
        int moles[][] = {{2,0,2},{5,2,0},{4,1,0},{1,2,1},{3,0,2}};
        System.out.println(getMaximumNumber(moles));
    }
    public static int getMaximumNumber(int[][] moles) {
        Arrays.sort(moles,(a,b)->(a[0]-b[0]));
        int now[] = {1,1};
        int time = 0;
        int count = 0;
        int DP[] = new int[moles[moles.length-1][0]+1];

        if (moles[0][0]==0){
            if (moles[0][1]==1&&moles[0][2]==0){
                DP[0] = 1;
            }
        }

        for (int i = 0;i<moles.length;i++) {
            if (moles[i][0]==0){
                continue;
            }
            int temp = 1;
            boolean flag = true;
            for (int j = i-1; j >= 0; j--) {
                int d = Math.abs(moles[j][1]-moles[i][1])+Math.abs(moles[j][2]-moles[i][2]);
                int T = moles[i][0]-moles[j][0];
                if (T>d){
                    if (DP[moles[i][0]] < temp+DP[moles[j][0]]){
                        DP[moles[i][0]] = temp+DP[moles[j][0]];
                        flag = false;
                    }
                }
            }
            if (flag){
                DP[moles[i][0]] = temp;
            }
        }
        System.out.println(Arrays.toString(DP));
//        for (int i = 0;i<moles.length;i++){
//            int temp = Math.abs(moles[i][1]-now[0])+Math.abs(moles[i][2]-now[1]);
//            if (moles[i][0]-time >= temp){
//                count++;
//                now[0] = moles[i][1];
//                now[1] = moles[i][2];
//                time = moles[i][0];
//            }
//        }
        for (int i=0;i<moles.length;i++){
            System.out.println(Arrays.toString(moles[i]));
        }
        return count;
    }
}
