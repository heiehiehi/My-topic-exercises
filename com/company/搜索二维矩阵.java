package com.company;

public class 搜索二维矩阵 {
    public static void main(String[] args) {
        int matrix[][] = {{1}};
        int target = 0;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int low = -1, high = matrix.length - 1;
        while (low < high) {
            int mid = (high - low + 1) / 2 + low;
            if (matrix[mid][0] <= target) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(low);
        int m = low;
        if (m<0){
            return false;
        }
        low = 0;
        high = matrix[0].length - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (matrix[m][mid] == target) {
                return true;
            } else if (matrix[m][mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
