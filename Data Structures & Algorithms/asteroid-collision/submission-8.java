class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i = 0 ; i < n ; i++)
        {
            if(!st.isEmpty() && arr[i] < 0 && st.peek() > 0)
            {
                boolean flag = true;
                while(!st.isEmpty() && st.peek() > 0)
                {
                    if(Math.abs(arr[i]) > st.peek())
                    {
                        st.pop();
                    }
                    else if(Math.abs(arr[i]) == st.peek())
                    {
                        st.pop();
                        flag = false;
                        break;
                    }
                    else
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                {
                    st.push(arr[i]);
                }
            }
            else
            {
                st.push(arr[i]);
            }
        }
        int[] ans = new int[st.size()];
        for(int i = st.size() - 1 ; i >= 0 ; i--)
        {
            ans[i] = st.pop();
        }
        return ans;
    }
}