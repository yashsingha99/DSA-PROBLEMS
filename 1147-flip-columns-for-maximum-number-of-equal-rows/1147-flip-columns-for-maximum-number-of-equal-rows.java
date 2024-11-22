class Solution {
    public int maxEqualRowsAfterFlips(int[][] mat) {
        int max = -1;
        for (int row = 0; row < mat.length; row++) {
            int[] inv = new int[mat[0].length];

            for (int col = 0; col < mat[0].length; col++) {
                inv[col] = 1 - mat[row][col];
            }
            int cnt = 0;
            for (int[] A : mat) {
                if (Arrays.equals(A, inv) || Arrays.equals(A, mat[row])) {
                    cnt++;
                }
            }

            max = Math.max(max, cnt);
        }
        return max;
    }
}