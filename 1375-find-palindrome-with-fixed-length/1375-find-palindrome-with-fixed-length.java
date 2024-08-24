class Solution {
    String nthPalindrom(int n, int k) {
        int temp = (k & 1) != 0 ? k / 2 : (k / 2) - 1;
        int pal = (int)Math.pow(10, temp);
        pal += n - 1;
        StringBuilder sb = new StringBuilder(Integer.toString(pal));
        if ((k & 1) > 0)
            pal /= 10;
        while (pal > 0) {
            sb.append(pal % 10);
            pal /= 10;
        }

        return sb.toString();
    }

    public long[] kthPalindrome(int[] q, int len) {
        int n = q.length;
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            String num = nthPalindrom(q[i], len);
            if (num.length() == len)
                res[i] = Long.parseLong(num);
            else
                res[i] = -1;
        }
        return res;

    }
}