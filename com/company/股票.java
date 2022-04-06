package com.company;

public class 股票 {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int DP[][] = new int[prices.length][2];
        DP[0][0] = 0;
        DP[0][1] = -prices[0];
        for (int i = 1;i<prices.length;i++){
            DP[i][0] = Math.max(DP[i-1][0],DP[i-1][1]+prices[i]);
            DP[i][1] = Math.max(DP[i-1][1],-prices[i]);
        }
        return DP[prices.length-1][0];
    }
}
