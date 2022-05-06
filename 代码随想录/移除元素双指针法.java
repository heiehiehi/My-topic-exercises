package 代码随想录;

public class 移除元素双指针法 {
    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int fastsp;
        int slowsp = 0;
        for (fastsp = 0;fastsp < len;fastsp++){
            if (nums[fastsp]!=val){
                nums[slowsp] = nums[fastsp];
                slowsp++;
            }
        }
        return slowsp;
    }
}
