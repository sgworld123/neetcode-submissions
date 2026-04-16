class StockSpanner {
    Stack<int[]> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int curr = 1;
        while(!st.isEmpty() && price >= st.peek()[0])
        {
            curr += st.pop()[1];
        }
        st.push(new int[]{price,curr});
        return curr; 
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */