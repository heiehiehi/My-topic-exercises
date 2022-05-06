package 代码随想录;

import java.util.*;

public class 组合总和II {
    public static void main(String[] args) {
        int candidates[] = {10,1,2,7,6,1,5};
        int target = 8;
        combinationSum2(candidates,target);
        for (List<Integer> i:list){
            System.out.println(i.toString());
        }
    }
    static List<List<Integer>> list = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        System.out.println(Arrays.toString(candidates));
        backtracking(0,0,candidates,target);
        List<List<Integer>> ans = new ArrayList<>(list);
        return ans;
    }
    public static void backtracking(int sum,int startindex,int candiates[],int target){
        if (sum == target){
            List<Integer> temp = new ArrayList<>(path);
            if (!list.contains(temp)){
                list.add(temp);
            }
            return;
        }
        for (int i = startindex;i<candiates.length&&sum+candiates[i]<=target;i++){
            if(i>startindex&&candiates[i]==candiates[i-1]){
                continue;
            }
            path.add(candiates[i]);
            backtracking(sum+candiates[i],i+1,candiates,target);
            path.remove(path.size()-1);
        }
    }
}
