package 代码随想录;

import java.util.Arrays;

public class 反转字符串II {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s,2));
    }
    public static String reverseStr(String s, int k) {
        char str[] = s.toCharArray();
        for (int i = 0;i< str.length;i+=2*k){
            if (i+k<=str.length){
                reverse(str,i,i+k-1);
                continue;
            }
            reverse(str,i, str.length-1);
        }
        return String.valueOf(str);
    }
    public static void reverse(char str[],int left,int right){
        while (left<right){
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
    }
}
