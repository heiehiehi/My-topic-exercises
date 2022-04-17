package com.company;

public class 买钢笔和铅笔的方案数 {
    public static void main(String[] args) {
        int total = 10;
        int cost1 = 2;
        int cost2 = 1;
        long ans = waysToBuyPensPencils(total,cost1,cost2);
        System.out.println(ans);
    }
    public static long waysToBuyPensPencils(int total, int cost1, int cost2) {
        int count = 0;
        int gan = total/cost1;
        int qian = total/cost2;
        for (int i = 0;i <=gan;i++){
            for (int j =0;j<=qian;j++){
                if (i*cost1+j*cost2<=total){
                    count++;
                    System.out.println(i+" "+j);
                }
                else {
                    break;
                }
            }
        }
        return count;
    }
}
