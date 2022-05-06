package 代码随想录;

import java.util.Arrays;

public class strStrKMP实现 {
    public static void main(String[] args) {
        System.out.println(strStr("","abcabcabcab"));
    }
    public static int strStr(String haystack, String needle) {
        int next[] = new int[needle.length()];
        next(next,needle);
        int j = 0;
        for (int i = 0;i<haystack.length();i++){
            while (j>0&&haystack.charAt(i)!=needle.charAt(j)){
                j = next[j-1];
            }
            if (haystack.charAt(i)==needle.charAt(j)){
                j++;
            }
            if (j==needle.length()){
                return i-needle.length()+1;
            }
        }
        System.out.println(Arrays.toString(next));
        return -1;
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
