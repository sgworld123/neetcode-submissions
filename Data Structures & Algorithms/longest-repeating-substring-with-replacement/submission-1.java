class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int i = 0;
        int j = 0;
        int n = s.length();
        int maxcount = 0;
        int ans = 0;
        while(j < n)
        {
            arr[s.charAt(j) - 'A']++;
            maxcount = Math.max(maxcount,arr[s.charAt(j) - 'A']);

            while((j - i + 1) - maxcount > k)
            {
                arr[s.charAt(i) - 'A']--;
                i++;
            }
            ans = Math.max(ans,j - i + 1);
            j++;
        }
        return ans;
    }
}
