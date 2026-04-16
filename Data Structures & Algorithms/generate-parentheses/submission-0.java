class Solution {
    public void fun(int n,String s ,List<String> li)
    {
        if(s.length() == 2 * n)
        {
            if(valid(s))
            {
                li.add(s);
            }
            return;
        }
        fun(n,s + "(",li);
        fun(n,s + ")",li);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        fun(n,"",ans);
        return ans;
    }
    public boolean valid(String str)
    {
        Stack<Character> st = new Stack<>();
        for(var i : str.toCharArray())
        {
            if(st.isEmpty())
            {
                if(i == '(')
                {
                    st.push('(');
                }
                else
                {
                    return false;
                }
            }
            else if(i == '(')
            {
                st.push('(');
            }
            else if(i == ')' && st.peek() == '(')
            {
                st.pop();
            }
        }
        return st.isEmpty();

    }
}
