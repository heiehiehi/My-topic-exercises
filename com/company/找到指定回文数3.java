package com.company;

import java.util.Arrays;

public class 找到指定回文数3 {
    public static void main(String[] args) {
        int queries[] = {1,2,3,4,5,90};
        int intlength = 3;
        long haode[] = ok(queries,intlength);
        System.out.println(Arrays.toString(haode));
    }
    public static long[] ok(int queries[],int intLength){
        long ans[] = new long[queries.length];
        for (int i = 0;i<ans.length;i++){
            ans[i] = -1;
        }

        long count = 0;
        int max = 1;

        if(intLength%2==1){
            int qianban = intLength/2+1;

            for (long i = 0;i<qianban;i++){
                max=max*10;
            }

            for (int i = 0;i<queries.length;i++){
                count = queries[i]-1;
                long j = count + max/10;
                if (j<max){
                    String num = new StringBuilder(String.valueOf(j)).reverse().toString();
                    long ok = Long.parseLong(j/10 + num);
                    ans[i] = ok;
                }
            }
        }
        else{
            int qianban = intLength/2;
            for (long i = 0;i<qianban;i++){
                max=max*10;
            }

            for (int i = 0;i<queries.length;i++){
                count = queries[i]-1;
                long j = count + max/10;
                if (j<max){
                    String num = new StringBuilder(String.valueOf(j)).reverse().toString();
                    long ok = Long.parseLong(j + num);
                    ans[i] = ok;
                }
            }
        }

        return ans;
    }
}
