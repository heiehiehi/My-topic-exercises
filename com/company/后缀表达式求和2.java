package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class 后缀表达式求和2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int M=in.nextInt();
        int number[] =new int[N+M+1];
        int min=0,max=0;
        for(int x=0;x<number.length;x++)
        {
            number[x]=in.nextInt();
            if(number[min]>number[x])
            {
                min=x;
            }
            if(number[max]<number[x])
            {
                max=x;
            }
        }
        long sum=0;

        if(M==0)
        {
            for(int x=0;x<number.length;x++)
            {
                sum +=number[x];
            }
            System.out.println(sum);
        }
        else
        {
            for(int x=0;x<number.length;x++)
            {
                sum +=Math.abs(number[x]);
            }

            sum=(sum-Math.abs(number[max])-Math.abs(number[min]))+(number[max]-number[min]);
            System.out.println(sum);
        }
    }
}
