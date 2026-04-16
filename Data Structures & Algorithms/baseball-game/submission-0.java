class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st  = new Stack<>();
        int n = operations.length;
        for(int i = 0 ; i < n ; i++)
        {
            if(isNumber(operations[i]))
            {
                st.push(Integer.parseInt(operations[i]));
            }
            else if(operations[i].equals("+"))
            {
                int val1 = st.pop();
                int val2 = st.pop();
                st.push(val2);
                st.push(val1);
                st.push(val1 + val2);
            }
            else if(operations[i].equals("D"))
            {
                st.push(2 * st.peek());
            }
            else if(operations[i].equals("C"))
            {
                st.pop();
            }

        }
        int ans = 0;
        for(var i : st)
        {
            ans += i;
        }
        return ans;
        
    }
    private boolean isNumber(String s) {
    try 
    {
        Integer.parseInt(s);  // agar string ko integer me convert kar paya
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
}