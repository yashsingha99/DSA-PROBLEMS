class KthLargest {
PriorityQueue<Integer> pq;
int k = 0;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        this.k = k;
        for(int i : nums){
            pq.add(i);
            if(pq.size() > k)
              pq.poll();
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if (pq.size() > k){
            pq.poll();
        }
        return  pq.peek();
    }
}

