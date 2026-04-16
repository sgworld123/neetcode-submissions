class Solution {
    public int maxProfit(int[] nums) {
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        int ans = 0;
        int n = nums.length;
        while(j < n)
        {
            if(nums[j] < min)
            {
                min = nums[j];
            }
            else
            {
                ans = Math.max(nums[j] - min , ans);
            }
            j++;
        }
        return ans;
    }
}
