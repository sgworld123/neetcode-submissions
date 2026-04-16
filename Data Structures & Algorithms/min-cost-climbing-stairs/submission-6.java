class Solution {
    public int fun(int[] arr , int i,int[] dp)
    {
        // if(i < 0) return 0;
        // if(dp[i] != -1) return dp[i];
        // return dp[i] = arr[i] + Math.min(fun(arr,i - 1,dp) , fun(arr, i - 2,dp));
        return 0;
    }
    public int minCostClimbingStairs(int[] arr) {
        int n = arr.length;
        // int[] dp = new int[arr.length + 1];
        // for(int i = 0 ; i <= n ; i++)
        // {
        //     dp[i] = -1;
        // }
        // return Math.min(fun(arr,n - 1,dp),fun(arr,n - 2,dp)); 
        int a = arr[0];
        int b = arr[1];
        int c = 0;
        if(n == 1) return 0;
        if(n == 2) return Math.min(arr[0],arr[1]);
        for(int i = 2 ; i < n ; i++)
        {
            c = arr[i] + Math.min(a,b);
            if(i == n - 1) break;
            a = b;
            b = c;
        }
        return Math.min(c,b);
        
    }
}
