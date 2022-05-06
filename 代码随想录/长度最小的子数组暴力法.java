package 代码随想录;

public class 长度最小的子数组暴力法 {
    public static void main(String[] args) {
        int target = 7;
        int nums[] = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target,nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int sublength = 0;
        int min = 0;
        for (int i = 0;i<len;i++){
            int sum = 0;
            for (int j = i;j<len;j++){
                sum+=nums[j];
                if (sum>=target){
                    sublength  = j-i+1;
                    if (min==0){
                        min = sublength;
                    }
                    else if (sublength<min){
                        min = sublength;
                    }
                }
            }
        }
        return min;
    }
}
