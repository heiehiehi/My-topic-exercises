package com.company;

import java.util.Arrays;

public class 找到指定回文数2 {
    public static void main(String[] args) {
        int queries[] = {83,35,5,474568655,518949853,178697884,121250956,434016234,54,20};
        int intlength = 10;
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

            for (long i = max/10;i<max;i++){
                count++;
                for (int j = 0;j<ans.length;j++){
                    if (queries[j]==count){
                        String num = new StringBuilder(String.valueOf(i)).reverse().toString();
                        long ok = Long.parseLong(i/10 + num);
                        ans[j] = ok;
                    }
                }
            }
        }
        else{
            int qianban = intLength/2;
            for (long i = 0;i<qianban;i++){
                max=max*10;
            }

            for (long i = max/10;i<max;i++){
                count++;
                for (int j = 0;j<ans.length;j++){
                    if (queries[j]==count){
                        String num = new StringBuilder(String.valueOf(i)).reverse().toString();
                        long ok = Long.parseLong(i + num);
                        ans[j] = ok;
                    }
                }
            }
        }

        return ans;
    }
}
