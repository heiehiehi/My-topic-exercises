package com.company;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class 乘积尾零 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[10][10];
        int ans = 0;
        BigInteger big = new BigInteger("1");
        for (int i=0;i<10;i++){

            for (int j=0;j<10;j++){
                arr[i][j] = sc.nextInt();
                BigInteger ok = new BigInteger(arr[i][j]+"");
                big = big.multiply(ok);
            }

        }
        String s = big.toString();
        int last = s.length()-1;
        while (true){
            if (s.charAt(last)!='0'){
                break;
            }
            else {
                ans++;
                last--;
            }
        }
        System.out.println(ans);
    }
}
