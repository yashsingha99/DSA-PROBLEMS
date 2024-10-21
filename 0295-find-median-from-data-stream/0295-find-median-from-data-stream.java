class MedianFinder {
    PriorityQueue<Integer> pq1 = new PriorityQueue<>();
    PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {

    }

    public void addNum(int num) {
        if(pq1.size() == pq2.size()){
          pq2.add(num);
          pq1.add(pq2.poll());
        } else{
        pq1.add(num);
        pq2.add(pq1.poll());
        }

    }

    public double findMedian() {
        if(pq1.size() != pq2.size()){
            return (double) pq1.peek();
        }
        return (double) (pq1.peek() + pq2.peek()) / 2;
    }
}