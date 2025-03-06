class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] arr = new int[(n * n) + 1];
        int[] ans = new int[2];
        for (int G[] : grid) {
            for (int val : G) {
                arr[val]++;
                if (arr[val] == 2)
                    ans[0] = val;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                ans[1] = i;
            }
        }
        return ans;
    }
}