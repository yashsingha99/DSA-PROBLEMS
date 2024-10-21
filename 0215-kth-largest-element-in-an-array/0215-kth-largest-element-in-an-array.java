class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums){
            if(pq.size() == k){
                if(pq.peek() < i){
                    pq.poll();
                    pq.add(i);
                }
            } else {
                pq.add(i);
            }
        }
        return pq.peek();
    }
}