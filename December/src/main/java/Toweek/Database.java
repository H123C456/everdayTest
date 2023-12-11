package Toweek;

public class Database {

    public static void main(String[] args) {
        int n=4;

        if (n==0) System.out.println(0);
        if (n==0) System.out.println(1);
        int[]  dp = new int[n+1];
        dp[1] = 1;
        for (int i=2;i<n+1;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
    }
}
