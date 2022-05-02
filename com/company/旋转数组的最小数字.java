package com.company;

public class 旋转数组的最小数字 {
    public static void main(String[] args) {
        int numbers[] = {1,1};
        System.out.println(minArray(numbers));
    }
    public static int minArray(int[] numbers) {
        int now = 0;
        int len = numbers.length;
        int count = 0;
        while (numbers[(now+1)%len]>=numbers[now]&&count<=len){
            now = (now+1)%len;
            count++;
        }
        return numbers[(now+1)%len];
    }
}
