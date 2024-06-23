class Solution {
    public int longestSubarray(int[] nums, int lim) {
        int n = nums.length;
        int res = 0;
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]
        );
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> a[0] - b[0]
        );
        int left = 0;
        for(int i = 0; i < n; i++){
            maxHeap.offer(new int[] {nums[i], i});
            minHeap.offer(new int[] {nums[i], i});
            while(Math.abs(maxHeap.peek()[0] - minHeap.peek()[0]) > lim){
                 left = Math.min(maxHeap.peek()[1], minHeap.peek()[1])+1;
                
                while(maxHeap.peek()[1] < left)
                   maxHeap.poll();
                while(minHeap.peek()[1] < left)
                   minHeap.poll();
                   
            }
            res = Math.max(res, i - left + 1);
        }

        return res;
    }
}