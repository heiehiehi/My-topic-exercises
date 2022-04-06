package com.company;

import java.util.HashSet;
import java.util.Set;

public class 数的分解 {
    public static void main(String[] args) {
        long ans = 0;

        Set set2 = new HashSet<Set>();
        for (int i = 1;i<2019;i++){
            for (int j = 1;j<=2019-i;j++){
                if (2019-i-j>0){
                    String s = String.valueOf(i)+String.valueOf(j)+String.valueOf(2019-i-j);

                    if ((!s.contains("2"))&&(!s.contains("4"))){
                        Set set = new HashSet<Integer>();
                        set.add(i);
                        set.add(j);
                        set.add(9-i-j);
                        set2.add(set);
                        System.out.println(i+"+"+j+"+"+(2019-i-j));
                    }
                }
            }
        }
        System.out.println(set2.size());
    }

}
