package com.company;

public class 买卖股票最好时机 {
    public static void main(String[] args) {
        //贪心算法解决
        int arr[] = {7,6,4,3,1};
        int nowmin = 0;
        int nowmax = 0;
        int sum = 0;
        for(int i = 0;i+1<arr.length;i++){
            if (arr[i]<arr[i+1]){
                nowmax = i+1;
            }
            else{
                sum += arr[nowmax] - arr[nowmin];
                nowmax = i+1;
                nowmin = i+1;
            }
        }
        sum += arr[nowmax] - arr[nowmin];
        System.out.println(sum);
    }
}
