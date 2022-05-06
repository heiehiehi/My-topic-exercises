package 代码随想录;

public class 长度最小的子数组滑动窗口解法 {
    public static void main(String[] args) {
        int target = 7;
        int nums[] = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target,nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int sublength = 0;
        int min = 0;
        int start = 0;//窗口滑动初始位置
        int sum = 0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            while (sum>=target){
                sublength = i-start+1;
                if (min == 0){
                    min = sublength;
                }
                else if (sublength<min){
                    min = sublength;
                }
                sum-=nums[start++];
            }
        }
        return min;
    }
}
