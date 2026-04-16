class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int i = 0;
        int j = 0;
        int[] arr = new int[26];
        int n = arr.length;
        for(var a : s1.toCharArray())
        {
            arr[a - 'a']++;
        }
        while(j < s2.length())
        {
            arr[s2.charAt(j) - 'a']--;
            if(j - i +1 == s1.length())
            {
                if(isValid(arr))
                {
                    return true;
                }
                arr[s2.charAt(i) - 'a']++;
                i++;
            }
            j++;
        }
        return false;
    }
    public boolean isValid(int[] arr)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] >  0)
            {
                return false;
            }
        }
        return true;
    }
}
