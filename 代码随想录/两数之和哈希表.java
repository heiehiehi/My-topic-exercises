package 代码随想录;

import java.util.Arrays;
import java.util.HashMap;

public class 两数之和哈希表 {
    public static void main(String[] args) {
        int nums[] = {3,2,4};
        System.out.println(Arrays.toString(twoSum(nums,6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res[] = new int[2];
        for (int i = 0;i < nums.length;i++){
            int temp = target - nums[i];
            if (map.containsKey(temp)){
                res[0] = i;
                res[1] = map.get(temp);//排除获得相同的数
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
