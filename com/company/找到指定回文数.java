package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 找到指定回文数 {
    public static void main(String[] args) {
        int queries[] = {2,201429812,8,520498110,492711727,339882032,462074369,9,7,6};
        int intlength = 1;
        long haode[] = ok(queries,intlength);
        System.out.println(Arrays.toString(haode));
    }
    public static long[] ok(int queries[],int intLength){
        long ans[] = new long[queries.length];
        for (int i = 0;i<ans.length;i++){
            ans[i] = -1;
        }

        int max = 1;
        for (long i = 0;i<intLength;i++){
            max=max*10;
        }
        int count = 0;
        System.out.println(max);

        for (long i = max/10;i<max;i++){
            long b = Integer.valueOf(new StringBuilder(String.valueOf(i)).reverse().toString());
            if ( i == b){
                System.out.println(i);
                count++;

                for (int k = 0;k<queries.length;k++){
                    if (queries[k]==count){
                        ans[k] = i;
                    }
                }
            }

        }

        return ans;
    }
}
