package com.company;

public class 位1的个数 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(19684));
    }
    public static boolean isPowerOfThree(int n) {
        boolean flag = true;
        if(n<1){
            while(n%3==0){
                n=n/3;
            }
        }
        if(n%3!=1){
            flag = false;
        }
        return flag;
    }
}
