class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length(), c = 0;
        int len = n / k;
        if (n % k != 0)
            len++;
        String[] ans = new String[len];
        for (int i = 0; i < n; i += k) {
            int j = i;
            StringBuilder sb = new StringBuilder();
            while (j < i + k && j < n) {
                sb.append(s.charAt(j++));
            }
            int sbNeed = k - sb.length();
            while (sbNeed-- > 0) {
                sb.append(fill);
            }
            ans[c++] = sb.toString();
        }

        return ans;
    }
}