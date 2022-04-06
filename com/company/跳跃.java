package com.company;

import java.util.Scanner;

public class 跳跃 {
    static int max = 0;
    static int m = 0;
    static int n = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int map[][] = new int[m][n];
        for (int i = 0;i<m;i++){
            for (int j=0;j<n;j++){
                map[i][j] = sc.nextInt();
            }
        }
        f(0,0,0,map);
        System.out.println(max);
    }
    public static void f(int x,int y,int sum,int map[][]){
        sum+=map[x][y];
        if (x==m-1&&y==n-1){
            if (max<sum){
                max = sum;
            }
            return;
        }

        if (x+3<m){
            f(x+3,y,sum,map);
        }
        if (x+2<m){
            f(x+2,y,sum,map);
        }
        if (x+1<m){
            f(x+1,y,sum,map);
        }


        if (y+3<n){
            f(x,y+3,sum,map);
        }
        if (y+2<n){
            f(x,y+2,sum,map);
        }
        if (y+1<n){
            f(x,y+1,sum,map);
        }
    }
}
