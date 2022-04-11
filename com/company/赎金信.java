package com.company;

import java.util.Arrays;

public class 赎金信 {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for (int i = 0;i<ransomNote.length();i++){
            int temp = (int)(ransomNote.charAt(i)-'a');
            arr1[temp]++;
        }
        for (int i = 0;i<magazine.length();i++){
            int temp = (int)(magazine.charAt(i)-'a');
            arr2[temp]++;
        }
        boolean flag = true;
        for (int i = 0;i<arr1.length;i++){
            if (arr1[i]>arr2[i]){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
