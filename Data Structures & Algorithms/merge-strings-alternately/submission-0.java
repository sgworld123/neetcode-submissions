class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        int m = word1.length();
        int n = word2.length();
        StringBuilder sb = new StringBuilder();
        while(i < Math.min(m , n) && j < Math.min(m , n))
        {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i < m)
        {
            sb.append(word1.charAt(i));
            i++;
        }
        while(j < n)
        {
            sb.append(word2.charAt(j));
            j++;
        }
        return sb.toString();
    }
}