class SmallestInfiniteSet {
   int arr[];
   int top = 0;
    public SmallestInfiniteSet() {
        arr = new int[1001];
    }
    
    public int popSmallest() {
        while(arr[top] == -1) top++;
        arr[top] = -1;
        int val = top;
        top++;
        return val+1;
    }
    
    public void addBack(int num) {
        arr[num - 1] = 1;
        top = Math.min(top, num - 1);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */