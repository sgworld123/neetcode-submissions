class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        while(j < nums.length)
        {
            sum += nums[j];
            while(sum >= target)
            {
                sum -= nums[i];
                ans = Math.min(ans,j - i + 1);
                i++;
                // System.out.println(j - i );
            }
            j++;
        }
        if(ans == Integer.MAX_VALUE)
        return 0;
        return ans;
    }
}