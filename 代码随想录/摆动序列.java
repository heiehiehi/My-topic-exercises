package 代码随想录;

public class 摆动序列 {
    public static void main(String[] args) {

    }
    public int wiggleMaxLength(int[] nums) {
        if (nums.length<2)return nums.length;
        int cur = 0;//记录当前的值
        int pre = 0;//记录前一个的值
        int count = 0;
        for (int i = 1;i<nums.length-1;i++){
            cur = nums[i] - nums[i-1];
            if ((pre>=0&&cur<0)||(pre<=0&&cur>0)){
                count++;
                pre = cur;
            }
        }
        return count;
    }
}
