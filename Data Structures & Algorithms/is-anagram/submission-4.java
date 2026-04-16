class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        if(s.length() != t.length())
        {
            return false;
        }
        for(var c : s.toCharArray())
        {
           arr[c - 'a']++;
        }
        for(var c : t.toCharArray())
        {
            arr[c - 'a']--;
        }
        for(var i : arr)
        {
            if(i != 0)
            {
                return false;
            }
        }
        return true;
    }
}
