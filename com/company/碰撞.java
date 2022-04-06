package com.company;

public class 碰撞 {
    public static void main(String[] args) {
        String s = "RLRSLL";
        System.out.println(countCollisions(s));
    }

    public static int countCollisions(String directions) {
        int n = directions.length();
        int ans = 0;
        char arr[] = new char[directions.length()];
        for (int i = 0; i < n; i++) {
            arr[i] = directions.charAt(i);
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] == 'L') {
                if (arr[i-1] == 'R') {
                    ans += 2;
                    arr[i] = 'S';
                    arr[i-1] = 'S';
                }
                else if (arr[i-1] == 'S') {
                    ans += 1;
                    arr[i] = 'S';
                }
            }
            else if (arr[i] == 'S'){
                if (arr[i-1] == 'R') {
                    ans += 1;
                    arr[i] = 'S';
                    arr[i-1] = 'S';
                }
            }
        }

        for (int i = n-2; i >= 0; i--) {
            if (arr[i] == 'R') {
                if (arr[i+1] == 'L') {
                    ans += 2;
                    arr[i] = 'S';
                    arr[i+1] = 'S';
                }
                else if (arr[i+1] == 'S') {
                    ans += 1;
                    arr[i] = 'S';
                }
            }
            else if (arr[i] == 'S'){
                if (arr[i+1] == 'L') {
                    ans += 1;
                    arr[i] = 'S';
                    arr[i+1] = 'S';
                }
            }
        }
        return ans;
    }
}
