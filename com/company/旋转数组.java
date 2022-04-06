package com.company;

import java.util.Arrays;

public class 旋转数组 {
    public static void main(String[] args) {
        int arr[] = {-1};
        int k = 2;
        if (arr.length<k){
            k = k%arr.length;
        }
        int temp[] = new int[k];
        int j = k-1;
        for (int i = arr.length-1;j>=0;i--){
            temp[j] = arr[i];
            j--;
        }
        for (int i = arr.length-k-1;i>=0;i--){
            arr[i+k] = arr[i];
        }
        for (int i = 0;i<temp.length;i++){
            arr[i] = temp[i];
        }
    }
}
