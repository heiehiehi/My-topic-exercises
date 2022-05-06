package 代码随想录;

import java.util.ArrayList;
import java.util.List;

public class 组合总数III {
    public static void main(String[] args) {
        combinationSum3(3,7);
        for (List<Integer> i:list){
            System.out.println(i.toString());
        }
    }
    static List<List<Integer>> list = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();
    public static List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(k,n,0,1);
        return list;
    }
    public static void backtracking(int k,int n,int sum,int startindex){
        if (sum>n||path.size()>k){
            return;
        }
        if (path.size()==k){
            if (sum == n){
                list.add(new ArrayList(path));
                return;
            }
            return;
        }
        for (int i = startindex;i <= 9 - (k - path.size()) + 1 ; i++){
            path.add(i);
            backtracking(k,n,sum+i,i+1);
            path.remove(path.size()-1);
        }
    }
}
