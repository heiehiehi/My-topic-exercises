package 代码随想录;

import java.util.Arrays;

public class 分发饼干 {
    public static void main(String[] args) {

    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int index = s.length-1;
        for (int i = g.length-1;i>=0;i--){
            if (index>=0&&g[i]<=s[index]){
                index--;
                count++;
            }
        }
        return count;
    }
}
