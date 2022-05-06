package 代码随想录;

import java.util.Arrays;

public class 重复的子字符串 {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("a"));
    }
    public static boolean repeatedSubstringPattern(String s) {
        int next[] = new int[s.length()];
        next(next,s);
        System.out.println(Arrays.toString(next));
        int count = 0;
        int len = next.length;
        if (next[len-1]!=0&&len%(len-next[len-1])==0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void next(int next[],String needle){
        int j = 0;
        next[0] = j;
        for (int i = 1;i<next.length;i++){
            while (j>0&&needle.charAt(j)!=needle.charAt(i)){
                j = next[j-1];
            }
            if (needle.charAt(j)==needle.charAt(i)){
                j++;
            }
            next[i] = j;
        }
    }
}
