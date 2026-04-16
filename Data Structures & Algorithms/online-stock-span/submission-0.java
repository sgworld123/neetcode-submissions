class StockSpanner {
    ArrayList<Integer> li;
    public StockSpanner() {
        li = new ArrayList<>();
    }
    
    public int next(int price) {
        li.add(price);
        int c = 0;
        int i = li.size() - 1;
        while(i >= 0 && li.get(i) <= price)
        {
            c++;
            i--;
        }
        return c;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */