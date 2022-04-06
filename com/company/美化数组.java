package com.company;

public class 美化数组 {
    public static void main(String[] args) {
        int nums[] = {2,6,2,5,8,9,7,2,2,5,6,2,2,0,6,8,7,3,9,2,1,1,3,2,6,2,4,6,5,8,4,8,7,0,4,8,7,8,4,1,1,4,0,1,5,7,7,5,9,7,5,5,8,6,4,3,6,5,1,6,7,6,9,9,6,8,6,0,9,5,6,7,6,9,5,5,7,3,0,0,5,5,4,8,3,9,3,4,1,7,9,3,1,8,8,9,1,6,0,0};

        int ou = 0;
        int xiaobiao;
        int ans = 0;
        int count = 0;
        for (int i=0;i<nums.length;i++){
            xiaobiao = i;
            count++;
            if (ou%2==0){
                if (i+1<nums.length){
                    while (nums[xiaobiao]==nums[i+1]){
                        i++;
                        ans++;
                        if (i+1>=nums.length){
                            if (count%2!=0){
                                ans++;
                                break;
                            }
                        }
                    }
                }
                else if (count%2 != 0){
                    ans++;
                    break;
                }
            }
            ou++;
        }
        System.out.println(ans);
    }
}
