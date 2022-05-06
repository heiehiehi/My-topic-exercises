package 代码随想录;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 递增子序列 {
    public static void main(String[] args) {
        int nums[] = {4,6,7,7};
        findSubsequences(nums);
    }
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();
    public static List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(nums,0);
        return res;
    }
    public static void backtracking(int[] nums,int startIndex){
        if (path.size()>1){
            res.add(new ArrayList<>(path));
        }
        int hashnums[] = new int[201];
        for (int i = startIndex;i<nums.length;i++){
            if ((!path.isEmpty()&&nums[i]<path.get(path.size()-1))||hashnums[nums[i]+100]==1){
                continue;
            }
            hashnums[nums[i]+100]=1;
            path.add(nums[i]);
            backtracking(nums,i+1);
            path.remove(path.size()-1);
        }
    }
}
