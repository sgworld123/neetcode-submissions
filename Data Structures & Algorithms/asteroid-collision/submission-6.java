class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int currentAsteroid = arr[i];
            
            while (!st.isEmpty() && currentAsteroid < 0 && st.peek() > 0) {
                int stackTop = st.peek();
                
                if (Math.abs(currentAsteroid) < stackTop) {
                    currentAsteroid = 0;
                    break;
                } 
                else if (Math.abs(currentAsteroid) == stackTop) {
                    st.pop();
                    currentAsteroid = 0;
                    break;
                }
                else {
                    st.pop();
                }
            }
            
            if (currentAsteroid != 0) {
                st.push(currentAsteroid);
            }
        }
        
        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}