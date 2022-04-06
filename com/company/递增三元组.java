package com.company;

import java.util.Scanner;

public class 递增三元组 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arrA[] = new int[N];
        int arrB[] = new int[N];
        int arrC[] = new int[N];

        for (int i = 0;i<N;i++){
            arrA[i]=sc.nextInt();
        }
        for (int i = 0;i<N;i++){
            arrB[i]=sc.nextInt();
        }
        for (int i = 0;i<N;i++){
            arrC[i]=sc.nextInt();
        }

        int ans = 0;
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                if (arrA[i]>=arrB[j]){
                    continue;
                }
                for (int k=0;k<N;k++){
                    if (arrB[j]<arrC[k]){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
