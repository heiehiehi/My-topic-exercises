package 代码随想录;

import java.util.ArrayList;
import java.util.List;

public class 组合总和 {
    public static void main(String[] args) {

    }
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtracking(0,0,candidates,target);
        return list;
    }
    public void backtracking(int sum,int startindex,int candidates[],int target){
        if (sum>target){
            return;
        }
        if (sum==target){
            list.add(new ArrayList<>(path));
            return;
        }
        for (int i = startindex;i<candidates.length&&sum+i<=target;i++){
            path.add(candidates[i]);
            backtracking(sum+candidates[i],i,candidates,target);
            path.remove(path.size()-1);
        }
    }
}
