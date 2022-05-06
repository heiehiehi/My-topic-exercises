package 代码随想录;

import java.util.HashMap;
import java.util.HashSet;

public class 两个数组的交集 {
    public static void main(String[] args) {

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> nums11 = new HashSet<>();
        for (Integer i:nums1){
            nums11.add(i);
        }
        HashSet<Integer> ans = new HashSet<>();
        for (Integer j:nums2){
            if (nums11.contains(j)){
                ans.add(j);
            }
        }
        int ans1[] = new int[ans.size()];
        int index = 0;
        for (Integer i:ans){
            ans1[index++] = i;
        }
        return  ans1;
    }
}
