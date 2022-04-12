package com.company;

public class 汉明距离 {
    public static void main(String[] args) {
        System.out.println(hammingDistance(3,1));
    }
    public static int hammingDistance(int x, int y) {
        int n = x^y;
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
