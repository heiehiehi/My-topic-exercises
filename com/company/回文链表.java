package com.company;

public class 回文链表 {
    public static void main(String[] args) {
        System.out.println(isPalindrome());
    }
    public static boolean isPalindrome() {

//        head = head.next;
        int arr[] = {1,2,3,1};


        boolean flag = true;
        boolean ans = true;
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if (arr[left]==arr[right]){
                left++;
                right--;
            }
            else if(flag){
                if (arr[left+1]==arr[right]){
                    left++;
                    flag = false;
                }
                else if (arr[left]==arr[right-1]){
                    right--;
                    flag = false;
                }
                else {
                    return false;
                }

            }
            else {
                return false;
            }
        }
        return true;
    }
}
