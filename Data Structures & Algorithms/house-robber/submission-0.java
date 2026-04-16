class Solution {
    public int fun(int[] nums,int i,int prev,int[][] dp)
    {
        if(i == nums.length) return 0;
        if(dp[i][prev + 1] != -1) return dp[i][prev + 1];
        int notTake = fun(nums,i + 1,prev,dp);
        int take = 0;
        if(prev == -1 || i - 1 != prev)
        {
            take = nums[i] + fun(nums,i + 1,i,dp);
        }
        return dp[i][prev + 1] = Math.max(take,notTake);
    }
    public int rob(int[] nums) {
        int[][] dp = new int[nums.length][nums.length + 1];
        for(int i = 0 ; i < nums.length ; i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return fun(nums,0,-1,dp);
    }
}
