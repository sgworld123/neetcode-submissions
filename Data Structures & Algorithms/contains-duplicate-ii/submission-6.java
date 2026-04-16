class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        int j = 0;
        HashSet<Integer> st = new HashSet<>();
        int n = nums.length;
        while(j < n)
        {
            if(st.contains(nums[j]))
            {
                return true;
            }
            st.add(nums[j]);
            if(j - i >= k)
            {
                st.remove(nums[i]);
                i++;
            }
            j++;
        }
        return false;
    }
}