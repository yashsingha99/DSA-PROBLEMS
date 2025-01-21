class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long suf = 0, pre = 0;

        for (int i : grid[0])
            pre += i;

        long min = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
             pre  -= grid[0][i];
             min = Math.min(min, Math.max(suf, pre));
             suf  += grid[1][i];
        }
        return min;
    }
}