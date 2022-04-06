package com.company;

public class 既约函数 {
    public static void main(String[] args) {
        int ans = 0;
        for (int i=1;i<=2020;i++){
            for (int j=1;j<i;j++){
                int a = i;
                int b = j;
                int temp;
                while (a!=b){
                    if (a>b){
                        a=a-b;
                    }
                    else{
                        b=b-a;
                    }
                }
                if (a==1){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
