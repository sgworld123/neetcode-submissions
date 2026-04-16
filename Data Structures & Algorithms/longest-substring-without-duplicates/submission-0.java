class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int i = 0;
        int j = 0;
        int c = 0;
        int n = s.length();
        int ans = 0;
        while(j < n)
        {
            if(st.contains(s.charAt(j)))
            {
                st.remove(s.charAt(i));
                i++;
                c = c - 1;
            }
            else
            {
                st.add(s.charAt(j));
                j++;
                c++;
            }
            ans = Math.max(ans,c);
        }
        return ans;
    }
}
