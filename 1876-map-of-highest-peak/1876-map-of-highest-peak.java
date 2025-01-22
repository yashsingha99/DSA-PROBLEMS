class Solution {
    public int[][] highestPeak(int[][] w) {
        Queue<int[]> q = new LinkedList<>();
        int n = w.length, m = w[0].length;
        int[][] dir = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (w[i][j] == 1) {
                    q.add(new int[] { i, j });
                } else {
                    res[i][j] = -1;
                }
            }
        }

        while (!q.isEmpty()) {
            int len = q.size();
            int[] node = q.poll();
            int i = node[0];
            int j = node[1];
            for (int[] d : dir) {
                int _i = i + d[0];
                int _j = j + d[1];
                if (_i >= 0 && _j >= 0 && _i < n && _j < m && res[_i][_j] == -1) {
                    res[_i][_j] = res[i][j] + 1;
                    q.add(new int[] { _i, _j });
                }
            }
        }
        return res;
    }
}
