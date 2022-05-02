package com.company;

import java.util.Arrays;

public class 快乐数 {
    public static void main(String[] args) {
        System.out.println(isHappy(200));
    }
    public static boolean isHappy(int n) {
        int h[] = new int[101];
        h[1] = 1;
        h[7] = 1;
        h[10] = 1;
        h[13] = 1;
        h[19] = 1;
        h[23] = 1;
        h[28] = 1;
        h[31] = 1;
        h[32] = 1;
        h[44] = 1;
        h[49] = 1;
        h[68] = 1;
        h[70] = 1;
        h[79] = 1;
        h[82] = 1;
        h[86] = 1;
        h[91] = 1;
        h[94] = 1;
        h[97] = 1;
        h[100] = 1;
        String s = ""+n;
        while (Integer.valueOf(s)>=100){
            int sum = 0;
            for (int j = s.length()-1;j>=0;j--){
                int now = Integer.valueOf(s.charAt(j)+"");
                sum += now*now;
            }
            s = sum+"";
        }
        if (h[Integer.valueOf(s)]==1){
            return true;
        }
        else {
            return false;
        }
    }
}
