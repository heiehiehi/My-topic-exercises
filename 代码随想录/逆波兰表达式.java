package 代码随想录;

import java.util.Stack;

public class 逆波兰表达式 {
    public static void main(String[] args) {
        String tokens[] = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> ans = new Stack<>();
        for (String i :tokens){
            if (i.charAt(0)=='+'){
                int nums1 = ans.pop();
                int nums2 = ans.pop();
                ans.add(nums1+nums2);
            }
            else if (i.charAt(0)=='*'){
                int nums1 = ans.pop();
                int nums2 = ans.pop();
                ans.add(nums1*nums2);
            }
            else if (i.charAt(0)=='/'){
                int nums1 = ans.pop();
                int nums2 = ans.pop();
                ans.add(nums2/nums1);
            }
            else if (i.length()==1&&i.charAt(0)=='-'){
                int nums1 = ans.pop();
                int nums2 = ans.pop();
                ans.add(nums2-nums1);
            }
            else {
                ans.add(Integer.valueOf(i));
            }
        }
        return ans.pop();
    }
}
