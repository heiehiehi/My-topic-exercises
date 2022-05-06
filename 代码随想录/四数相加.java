package 代码随想录;

import java.util.HashMap;

public class 四数相加 {
    public static void main(String[] args) {

    }
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        int count = 0;
        for (Integer i:nums1){
            for (Integer j:nums2){
                int temp = i + j;
                if (ans.containsKey(temp)){
                    ans.put(temp, ans.get(temp)+1);
                }
                else {
                    ans.put(temp,1);
                }
            }
        }
        for (Integer i:nums3){
            for (Integer j:nums4){
                int temp = -(i+j);
                if (ans.containsKey(temp)){
                    count+=ans.get(temp);
                }
            }
        }
        return count;
    }
}
