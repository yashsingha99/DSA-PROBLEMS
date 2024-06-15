class Solution {
    public int findMaximizedCapital(int k, int w, int[] pro, int[] cap) {
        int n = pro.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = cap[i]; 
            arr[i][1] = pro[i]; 
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        int i = 0;
        while (k-- > 0) {
            while (i < n && arr[i][0] <= w) {
                pq.add(arr[i][1]); 
                i++;
            }
            if (pq.isEmpty()) break;
            w += pq.remove(); 
        }
        return w;
    }
}
