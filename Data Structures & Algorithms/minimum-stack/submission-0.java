class Pair
{
    int element;
    int minDown;
    Pair(int element ,int minDown)
    {
        this.element = element;
        this.minDown = minDown;
    }
}
class MinStack {
    Stack<Pair> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty())
        {
            st.add(new Pair(val,val));
        }        
        else
        {
            st.add(new Pair(val,Math.min(val,st.peek().minDown)));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().element;
    }
    
    public int getMin() {
        return st.peek().minDown;
    }
}
