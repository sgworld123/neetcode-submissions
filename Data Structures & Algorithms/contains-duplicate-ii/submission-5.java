class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        int j = 1;
        int n = nums.length;
        Set<Integer> li = new HashSet<>();
        li.add(nums[0]);
        while(j < n)
        {
            if(j - i <= k)
            {
                if(li.contains(nums[j]))
                {
                    return true;
                }
                li.add(nums[j]);
                j++;
            }
            else
            {
                li.remove(nums[i]);               
                i++;
            }
            
        }
        return false;
    }
}