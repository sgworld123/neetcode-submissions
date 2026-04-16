class Solution {
    public void reverseString(char[] s) {
        String str = new String(s);
        String rev = new StringBuilder(str).reverse().toString();
        char[] arr = rev.toCharArray();
        for(int i = 0; i < arr.length ; i++)
        {
            s[i] = arr[i];
        }
    }
}