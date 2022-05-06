package 代码随想录;

import java.util.ArrayList;
import java.util.List;

public class 子集II {
    public static void main(String[] args) {

    }
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> result = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        list.add(new ArrayList<>(result));
        backtracking(nums,0);
        return list;
    }
    public void backtracking(int nums[],int startIndex){
        if (startIndex==nums.length-1){
            result.add(nums[startIndex]);
            list.add(new ArrayList<>(result));
            result.remove(result.size()-1);
            return;
        }
        for (int i = startIndex;i<nums.length;i++){
            if (i>startIndex&&nums[i]==nums[i-1]){
                continue;
            }
            result.add(nums[i]);
            list.add(new ArrayList<>(result));
            backtracking(nums,i+1);
            result.remove(result.size()-1);
        }
    }
}
