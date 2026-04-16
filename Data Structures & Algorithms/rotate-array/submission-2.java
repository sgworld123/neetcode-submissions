class Solution {
    public void rotate(int[] arr,int x , int y)
    {
        int temp = 0;
        while(x < y)
        {
            temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
            x++;
            y--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rotate(nums,0,nums.length - k - 1);
        rotate(nums,nums.length - k,nums.length - 1);
        rotate(nums,0,nums.length - 1);
    }
}