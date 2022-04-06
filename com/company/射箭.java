package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 射箭 {
    public static void main(String[] args) {
        int numArrows = 9;
        int aliceArrows[] = {1,1,0,1,0,0,2,1,0,1,2,0};
        int max[] = maximumBobPoints(numArrows,aliceArrows);
        System.out.println(Arrays.toString(max));
    }
    public static int[] maximumBobPoints(int numArrows, int[] aliceArrows) {
        double arr[] = new double[aliceArrows.length];
        int get[] = new int[aliceArrows.length];
        int ans[] = new int[aliceArrows.length];
        for (int i = aliceArrows.length-1;i>0;i--){
            get[i] = i;
        }

        for (int i = aliceArrows.length-1;i>0;i--){
            arr[i] = i/(aliceArrows[i]+1.0);
        }

        for (int i =0;i<aliceArrows.length;i++){
            for (int j=i+1;j<aliceArrows.length;j++){
                if (arr[i]>arr[j]){
                    double t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;

                    int g = aliceArrows[j];
                    aliceArrows[j] = aliceArrows[i];
                    aliceArrows[i] = g;

                    int m = get[j];
                    get[j] = get[i];
                    get[i] = m;
                }
            }
        }
        int sum = 0;
        int getsum = 0;
        for (int i=arr.length-1;i>0;i--){
            sum+=(aliceArrows[i]+1);
            if (sum<numArrows){
                getsum+=get[i];
                ans[get[i]] = aliceArrows[i]+1;
            }
            else if (sum == numArrows){
                getsum+=get[i];
                ans[get[i]] = aliceArrows[i]+1;
                break;
            }
            else if(sum >numArrows){
                sum-=(aliceArrows[i]+1);
            }
        }
        return ans;
    }

}
