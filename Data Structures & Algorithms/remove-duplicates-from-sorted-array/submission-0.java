class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int k = 0;
        int prev = -1;
        while(i < nums.length)
        {
            nums[k] = nums[i];
            prev = nums[k];
            k++;
            i++;
            while(i < nums.length && nums[i] == prev)
            {
                i++;
            }
            
        }
        return k ;
    }
}