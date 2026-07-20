class Solution {
    int[] dp;

    public int climbStairs(int n) {
        if(n<=2) return n;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;dp[1]=1;dp[2]=2;
        int res = solve(n);
        return res;
    }
    private int solve(int n){

        if(dp[n]!=-1) return dp[n];
        dp[n] = solve(n-1)+solve(n-2);
        return dp[n];
    }
}
