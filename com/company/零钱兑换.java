package com.company;

public class 零钱兑换 {
    public static void main(String[] args) {
        int coin[] = {474,83,404,3};
        System.out.println(coinChange(coin,264));
    }
    public static int coinChange(int[] coins, int amount) {
        int DP[] =new int[amount+1];
        for (int i = 1;i<amount+1;i++){
            DP[i] = amount+1;
            for (int j = 0;j<coins.length;j++){
                if (i-coins[j]<0){
                }
                else {
                    DP[i] = Math.min(DP[i],DP[i-coins[j]]+1);
                }
            }
        }
        if (DP[amount]>amount){
            return -1;
        }
        else {
            return DP[amount];
        }
    }
}
