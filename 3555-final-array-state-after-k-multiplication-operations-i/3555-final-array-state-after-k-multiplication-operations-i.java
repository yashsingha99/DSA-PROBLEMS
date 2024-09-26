class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (a[0] != b[0])
                        return Integer.compare(a[0], b[0]);
                    return Integer.compare(a[1], b[1]);
                });

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            pq.add(new int[] { nums[i], i });
        }
        while (k-- > 0) {
            int[] A = pq.poll();
            A[0] *= multiplier;
            pq.add(A);
        }
        while (!pq.isEmpty()) {
            int[] A = pq.poll();
            nums[A[1]] = A[0]; 
        }
        return nums;
    }
}