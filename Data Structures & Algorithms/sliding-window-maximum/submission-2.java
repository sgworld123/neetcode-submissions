class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0;
        int n = nums.length;
        int j = 0;
        int max = 0;
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        int[] ans = new int[n - k + 1];
        while(j < n)
        {
            pq.add(nums[j]);
            if(j - i + 1 == k)
            {
                ans[i] = pq.peek();
                pq.remove(nums[i]);
                i++;
            }
            j++;
        }
        // System.out.println("HMM");
        // for( ; i < n ; i++)
        // {
        //     ans[i] = pq.peek();
        // }
        return ans;
    }
}
