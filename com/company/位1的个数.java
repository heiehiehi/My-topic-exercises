package com.company;

public class 位1的个数 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(-3));
    }
    public static int hammingWeight(int n) {
        int t;
        int cnt = 31;
        int count = 0;
        while (cnt>=0){
            t = n&1;
            n = n>>>1;
            if (t==1){
                count++;
            }
            cnt--;
        }
        return count;
    }
}
