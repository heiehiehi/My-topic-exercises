package 代码随想录;

public class 连续子数组的最大和 {
    public static void main(String[] args) {

    }
    public int maxSubArray(int[] nums) {
        int DP[] = new int[nums.length];
        DP[0] = nums[0];
        int max = DP[0];
        for (int i = 1;i<nums.length;i++){
            if (DP[i-1]>nums[i]){
                DP[i] = DP[i-1]+nums[i];
            }
            else {
                DP[i] = nums[i];
            }
            if (max<DP[i]){
                max = DP[i];
            }
        }
        return max;
    }
}
