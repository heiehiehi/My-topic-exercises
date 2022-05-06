package 代码随想录;

import java.util.ArrayList;
import java.util.List;

public class 组合 {
    public static void main(String[] args) {
        combine(4,2);
        for (List<Integer> i:list){
            System.out.println(i.toString());
        }
    }
    static List<List<Integer>> list = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();
    public static List<List<Integer>> combine(int n, int k) {
        backtracking(1,n,k);
        return list;
    }
    public static void backtracking(int startindex,int n,int k){
        if (path.size() == k){
            list.add(new ArrayList<>(path));
        }
        for (int i = startindex;i<=n-(k-path.size())+1;i++){
            path.add(i);
            backtracking(i+1,n,k);
            path.remove(path.size()-1);
        }
    }
}
