package 代码随想录;

import java.util.Arrays;

public class 接雨水 {
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
//    public static int trap(int[] height) {
//        if (height.length==1||height.length==2){
//            return 0;
//        }
//        int high[] = new int[height.length];
//        int left = 0;
//        int right = 0;
//        for (int i = 0;i<height.length;i++){
//            if (height[i]>left){
//                high[i] = height[i];
//                left = height[i];
//            }
//            if (height[height.length-1-i]>right){
//                high[height.length-1-i] = height[height.length-1-i];
//                right = height[height.length-1-i];
//            }
//        }
//        //标记两位指针
//
//        int find = 0;
//        while (high[find]==0){
//            find++;
//        }
//        left = find;
//        right = find;
//        find++;
//        int sum = 0;
//        for (int i = find;i<high.length;i++){
//            if (high[i]!=0){
//                left = right;
//                right = i;
//                int min = Math.min(high[left],high[right]);
//                for (int j = left+1;j<right;j++){
//                    sum+=min-height[j];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(high));
//        System.out.println(sum);
//        return sum;
//    }
    //双指针版
    public static int trap(int[] height) {
        int sum = 0;
        for (int i = 0;i<height.length;i++){
            if (i==0||i==height.length-1){
                continue;
            }
            int lheight = height[i];
            int rheight = height[i];
            for (int l = i-1;l>=0;l--){
                if (height[l]>lheight){
                    lheight = height[l];
                }
            }
            for (int r = i+1;r<height.length;r++){
                if (height[r]>rheight){
                    rheight = height[r];
                }
            }
            sum+=Math.min(rheight,lheight)-height[i];
        }
        return sum;
    }
}
