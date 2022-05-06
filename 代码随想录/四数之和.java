package 代码随想录;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 四数之和 {
    public static void main(String[] args) {
        int nums[] = {1,-2,-5,-4,-3,3,3,5};
        int target = -11;
        List<List<Integer>> ans = fourSum(nums,target);
        for (List<Integer> integers:ans){
            System.out.println(integers.toString());
        }
    }
    public static List<List<Integer>> fourSum(int[] nums,int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length < 4){
            return ans;
        }
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int temptarget = target - nums[i];
            for (int j = i+1;j<nums.length;j++){
                if (j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                int left = j+1;
                int right = nums.length-1;
                int temptemptarget = temptarget - nums[j];
                while (left<right){
                    int sum = nums[left]+nums[right];
                    if (sum == temptemptarget){
                        List<Integer> res = new ArrayList<>();
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[left]);
                        res.add(nums[right]);
                        ans.add(res);
                        while (left<right&&nums[left]==nums[left+1]){
                            left++;
                        }
                        while (left<right&&nums[right]==nums[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                    else if (sum<temptemptarget){
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
        }
        return ans;
    }

}
