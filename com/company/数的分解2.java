package com.company;

import java.util.HashSet;
import java.util.Set;

public class 数的分解2 {
    public static void main(String[] args) {
        long ans = 0;
        for (int i = 1;i<2019/2;i++){
            for (int j = i+1;j<2019;j++){
                int k = 2019-i-j;
                if ((i<j)&&(j<k)){
                    String s = String.valueOf(i)+String.valueOf(j)+String.valueOf(2019-i-j);
                    if ((!s.contains("2"))&&(!s.contains("4"))){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }

}
