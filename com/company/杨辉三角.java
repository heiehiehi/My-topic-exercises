package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 杨辉三角 {
    public static void main(String[] args) {
        List<List<Integer>> YanHui = generate(5);
        for (List i:YanHui){
            for (Object j:i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        res.add(1);
        ans.add(res);
        if (numRows == 1){
            return ans;
        }

        for (int i = 1;i<numRows;i++){
            List<Integer> res2 = new ArrayList<>();
            res2.add(1);
            int temp;
            for (int j = 0;j<i-1;j++){
                List<Integer> mid = ans.get(i-1);
                temp = mid.get(j)+mid.get(j+1);
                res2.add(temp);
            }
            res2.add(1);
            ans.add(res2);
        }
        return ans;
    }
}
