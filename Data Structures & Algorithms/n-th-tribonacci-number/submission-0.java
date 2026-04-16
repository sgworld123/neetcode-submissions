class Solution {
    public int fun(int n,int[] dp)
    {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        if(dp[n] != -1) return dp[n];
        return dp[n] =  fun(n - 1,dp) + fun(n - 2,dp) + fun(n - 3,dp); 
    }
    public int tribonacci(int n) {
        int[] dp = new int[n + 1];
        for(int i = 0 ; i <= n ; i++)
        {
            dp[i] = -1;
        }
        return fun(n,dp);
    }
}