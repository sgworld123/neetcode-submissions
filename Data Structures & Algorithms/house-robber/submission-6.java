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
        if(nums.length == 1) return nums[0];
        dp[0] = nums[0];  
        dp[1] = Math.max(nums[0],nums[1]);
        if(nums.length == 2) return Math.max(dp[0],dp[1]);
        for(int i = 2 ; i < nums.length ; i++)
        {
            int notTake = dp[i - 1];
            int take = nums[i] + dp[i - 2];
            dp[i] = Math.max(take,notTake);
        }  
        return dp[nums.length - 1];
    }
}
