package 代码随想录;

public class 斐波拉切数列 {
    public static void main(String[] args) {

    }
    public int fib(int n) {
        int DP[];
        if (n>2){
            DP = new int[n+1];
        }
        else {
            DP = new int[2];
        }
        DP[0] = 0;
        DP[1] = 1;
        for(int i = 2;i<=n;i++){
            DP[i] = (DP[i-1] + DP[i-2])%1000000007;
        }
        return DP[n];
    }
}
