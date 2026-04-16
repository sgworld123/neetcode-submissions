class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            int req = target - nums[i];
            if(mpp.containsKey(req))
            {
                return new int[]{mpp.get(req),i};
            }
            else
            {
                mpp.put(nums[i],i);
            }
        } 
        return new int[]{};
    }
}
