package com.company;

import java.util.Arrays;

public class 取钱 {
    public static void main(String[] args) {
        ATM A = new ATM();
        int arr[] = {0,0,1,2,1};
        A.deposit(arr);
        System.out.println(Arrays.toString(A.withdraw(600)));
        int arr2[] = {0,1,0,1,1};
        A.deposit(arr2);
        System.out.println(Arrays.toString(A.withdraw(600)));
        System.out.println(Arrays.toString(A.withdraw(550)));


    }
}
class ATM {
    int arr[] = new int[5];
    int sum  = 0;
    public ATM() {

    }

    public void deposit(int[] banknotesCount) {
        for (int i =0 ;i<arr.length;i++){
            arr[i]+=banknotesCount[i];
        }

    }

    public int[] withdraw(int amount) {
        int ans1[] = {-1};
        sum = arr[4]*500+arr[3]*200+arr[2]*100+arr[1]*50+arr[0]*20;
        if (sum<amount){
            return ans1;
        }
        int ans[] = new int[5];
        int count = 0;
        for (int i = arr.length-1;i>=0;i--){
            if (amount==0){
                break;
            }
            if (i==4){
                if (amount>=500){
                    count = amount/500;
                    if (count>arr[4]){
                        amount = amount-arr[4]*500;
                        ans[4] = arr[4];
                        arr[4] = 0;
                    }
                    else {
                        amount = amount-count*500;
                        ans[4] = count;
                        arr[4] = arr[4]-count;
                    }
                }
            }
            else if (i==3){
                if (amount>=200){
                    count = amount/200;
                    if (count>arr[3]){
                        amount = amount-arr[3]*200;
                        ans[3] = arr[3];
                        arr[3] = 0;
                    }
                    else {
                        amount = amount-count*200;
                        ans[3] = count;
                        arr[3] = arr[3]-count;
                    }
                }
            }
            else if (i==2){
                if (amount>=100){
                    count = amount/100;
                    if (count>arr[2]){
                        amount = amount-arr[2]*100;
                        ans[2] = arr[2];
                        arr[2] = 0;
                    }
                    else {
                        amount = amount-count*100;
                        ans[2] = count;
                        arr[2] = arr[2]-count;
                    }
                }
            }
            else if (i==1){
                if (amount>=50){
                    count = amount/50;
                    if (count>arr[1]){
                        amount = amount-arr[1]*50;
                        ans[1] = arr[1];
                        arr[1] = 0;
                    }
                    else {
                        amount = amount-count*50;
                        ans[1] = count;
                        arr[1] = arr[1]-count;
                    }
                }
            }
            else if (i==0){
                if (amount>=20){
                    count = amount/20;
                    if (count>arr[0]){
                        amount = amount-arr[0]*20;
                        ans[0] = arr[0];
                        arr[0] = 0;
                    }
                    else {
                        amount = amount-count*20;
                        ans[0] = count;
                        arr[0] = arr[0]-count;
                    }
                }
            }
        }
        if (amount>0){
            return ans1;
        }
        else {
            return ans;
        }
    }
}
