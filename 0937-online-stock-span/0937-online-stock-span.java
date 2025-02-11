class StockSpanner {
    Stack<int[]> st;

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {
        int  cnt = 1;
        while(!st.isEmpty()){
           int[] A = st.peek();
           if(A[0] > price) break;
           cnt += A[1];
           st.pop();
        }
        st.push(new int[]{price, cnt});
        return cnt;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */