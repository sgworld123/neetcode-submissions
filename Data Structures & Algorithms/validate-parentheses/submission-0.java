class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(var i : s.toCharArray())
        {
            if(st.isEmpty() && (i == ')' || i == '}' || i ==']'))
            {
                return false;
            }
            else if(i == ')' && st.peek() == '(')
            {
                st.pop();
            }
            else if(i == '}' && st.peek() == '{')
            {
                st.pop();
            }
            else if(i == ']' && st.peek() == '[')
            {
                st.pop();
            }
            else
            {
                st.push(i);
            }
        }
        if(st.isEmpty())
        {
            return true;
        }
        return false;
    }
}
