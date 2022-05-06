package 代码随想录;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 全排列 {
    public static void main(String[] args) {
        int nums[] = {3,3,0,3};
        System.out.println(permuteUnique(nums));
    }
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();
    public static List<List<Integer>> permuteUnique(int[] nums) {
//        Arrays.sort(nums);
        boolean used[] = new boolean[nums.length];
        backtracking(nums,used);
        return res;
    }
    public static void backtracking(int nums[],boolean used[]){
        if (nums.length==path.size()){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0;i<nums.length;i++){
            //树层去重
            if (i>0&&nums[i]==nums[i-1]&&used[i-1]==false){
                continue;
            }
            //树枝叶去重
            if (used[i]==false){
                used[i] = true;
                path.add(nums[i]);
                backtracking(nums,used);
                path.remove(path.size()-1);
                used[i] = false;
            }
        }
    }
}
