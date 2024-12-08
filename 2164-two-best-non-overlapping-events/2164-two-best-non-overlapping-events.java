class Solution {
    Integer dp[][];
    int binarySearch(int[][] e, int endTime) {
        int l = 0, r = e.length - 1;
        int res = r + 1;
        
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (e[mid][0] <= endTime) {
                l = mid + 1;
            } else {
                res = mid;
                r = mid - 1;
            }
        }
        return res;
    }

    int find(int idx, int cnt, int[][] e) {
        if (cnt == 2 || idx >= e.length)
            return 0;
        if(dp[idx][cnt] != null) return dp[idx][cnt];
        int nextIdx = binarySearch(e, e[idx][1]);
        int l = 0;
        if (nextIdx != -1)
            l = e[idx][2] + find(nextIdx, cnt + 1, e);
        int r = find(idx + 1, cnt, e);
        return dp[idx][cnt] = Math.max(l, r);
    }

    public int maxTwoEvents(int[][] e) {
        int n = e.length;
        dp = new Integer[100001][3];

        Arrays.sort(e, (a, b) -> Integer.compare(a[0], b[0]));
        return find(0, 0, e);
    }
}