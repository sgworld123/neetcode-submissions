class Solution {
    public int fun(int[] nums,int i,int[] dp)
    {
        if(i >= nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        int notTake = fun(nums,i + 1,dp);
        int take = nums[i] + fun(nums,i + 2,dp);
        return dp[i] = Math.max(take,notTake);
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++)
        {
            dp[i] = -1;
        }
        return fun(nums,0,dp);
    }
}
