package com.company;

import java.util.Arrays;

public class 旋转图像 {
    public static void main(String[] args) {
        int matrix[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int n = matrix.length;
        int ceng = 0;
        for (int m = n;m>=0;m-=2,ceng++){
            //存储数组
            int temp1[] = new int[m];
            int temp2[] = new int[m];
            int temp3[] = new int[m];
            int temp4[] = new int[m];
            for (int i = 0;i<m;i++){
                temp1[i] = matrix[ceng][ceng+i];
            }
            for (int i = 0;i<m;i++){
                temp2[i] = matrix[ceng+i][ceng+m-1];
            }
            for (int i = 0;i<m;i++){
                temp3[i] = matrix[ceng+m-1][ceng+i];
            }
            for (int i = 0;i<m;i++){
                temp4[i] = matrix[ceng+i][ceng];
            }
            System.out.println(Arrays.toString(temp1));
            System.out.println(Arrays.toString(temp2));
            System.out.println(Arrays.toString(temp3));
            System.out.println(Arrays.toString(temp4));




            for (int i = 0;i<m;i++){
                matrix[ceng][ceng+i] = temp4[temp4.length-1-i];
            }
            for (int i = 0;i<m;i++){
                matrix[ceng+i][ceng+m-1] = temp1[i];
            }
            for (int i = 0;i<m;i++){
                matrix[ceng+m-1][ceng+i] = temp2[temp4.length-1-i];
            }
            for (int i = 0;i<m;i++){
                matrix[ceng+i][ceng] = temp3[i];
            }
        }
        for (int[] arr:matrix){
            System.out.println(Arrays.toString(arr));
        }
    }
}
