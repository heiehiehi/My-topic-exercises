package com.company;

public class 蛇形填数 {
    public static void main(String[] args) {
        int arr[][] = new int[100][100];
        int count = 0;
        for(int i=0;i<100;i++){
            for (int j = 0;j<=i;j++){
                count++;
                arr[j][i-j] = count;
                if (j==19&&i-j==19){
                    System.out.println(count);
                    break;
                }
            }
        }
    }
}
