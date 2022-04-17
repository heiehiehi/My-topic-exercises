package com.company;

public class 埃氏筛法 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(oula(n));
    }
    public static int ai(int x){
        int count = 0;
        boolean arr[] = new boolean[x+1];
        System.out.println(arr[1]);
        for (int i = 2;i <= x/i;i++){
            if (!arr[i]){
                for (int j = i*i;j<=x;j+=i){
                    arr[j] = true;
                }
            }
        }
        for (int i = 2;i<=x;i++){
            if (!arr[i])count++;
        }
        return count;
    }
    public static int oula(int n){
        int count = 0;
        boolean arr[] = new boolean[n+1];
        int pp = 0;
        int arr2[] = new int[n+1];
        for (int i = 2;i<=n;i++){
            if (!arr[i]){
                arr2[++pp] = i;
                count++;
            }
            for (int j = 1;arr2[j]*i<=n;j++){
                arr[arr2[j]*i] = true;
                if (i%arr2[j]==0){
                    break;
                }
            }
        }
        return count;
    }
    public static int oula2(int n){
        boolean arr[] = new boolean[n+1];
        int arr2[] = new int[n+1];
        int pp = 0;
        int count = 0;
        for (int i = 2;i<=n;i++){
            if (!arr[i]){
                arr2[++pp] = i;
                count++;
            }
            for (int j = 1;arr2[j]*i<=n;j++){
                arr[arr2[j]*i] = true;
                if (i%arr2[j]==0){
                    break;
                }
            }
        }
        return count;
    }
}
