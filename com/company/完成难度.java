package com.company;

import java.util.Arrays;

public class 完成难度 {
    public static void main(String[] args) {
        int tasks[] = {2,3,3};
        System.out.println(minimumRounds(tasks));
    }
    public static int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int arr[] = new int[tasks.length];
        int now = 0;
        arr[now]++;
        for (int i = 1;i<tasks.length;i++){
            if (tasks[i]==tasks[i-1]){
                arr[now]++;
            }
            else {
                now++;
                arr[now]++;
            }
        }
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 0;arr[i]!=0;i++){
            for (int j = arr[i]/3;j>=0;j--){
                if (j==0){
                    if ((arr[i]-(j*3))%2!=0){
                        return -1;
                    }
                }
                if ((arr[i]-(j*3))%2==0){
                    count+=j+(arr[i]-(j*3))/2;
                    break;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
        return count;
    }
}
