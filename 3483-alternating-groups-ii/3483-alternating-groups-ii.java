class Solution {
    public int numberOfAlternatingGroups(int[] c, int k) {
        int n = c.length;
        int[] temp = new int[n + k - 1];

        System.arraycopy(c, 0, temp, 0, n);
        System.arraycopy(c, 0, temp, n, k - 1);

        int cnt = 0, left = 0;
        for (int right = 1; right < temp.length; right++) {
            if (temp[right - 1] == temp[right]) {
                left = right;
            }
            if (right - left + 1 >= k)
                cnt++;
        }
        return cnt;
    }
}