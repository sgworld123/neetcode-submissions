class Solution {
    public int fun(int i,int[] dp)
    {
        if(i == 1)
        {
            return 1;
        }
        if(i == 2)
        {
            return 2;
        }
        if(dp[i] != -1)
        {
            return dp[i];
        }
        return dp[i] = fun(i - 1,dp) + fun(i - 2,dp);
    }
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        // for(int i = 0 ; i <= n ; i++)
        // {
        //     dp[i] = -1;
        // }
        // return fun(n,dp);
        if(n == 1) return 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3 ; i <= n ; i++)
        {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

    }
}
