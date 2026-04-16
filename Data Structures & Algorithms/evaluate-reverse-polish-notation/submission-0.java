class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String c : tokens) {
            if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
                int a = st.pop(); // right
                int b = st.pop(); // left
                if (c.equals("+")) st.push(b + a);
                else if (c.equals("-")) st.push(b - a);
                else if (c.equals("*")) st.push(b * a);
                else if (c.equals("/")) st.push(b / a);
            } else {
                st.push(Integer.parseInt(c)); // number (including negatives)
            }
        }
        return st.peek();
    }
}
