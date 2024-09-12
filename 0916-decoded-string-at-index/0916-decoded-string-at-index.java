class Solution {
    public String decodeAtIndex(String s, int k) {
        int n = s.length();
        long len = 0;
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(s.charAt(i))) {
                len *= (s.charAt(i) - '0');
            } else len++;
        }
        for (int i = n - 1; i >= 0; i--) {
            k %= len;
            if (k == 0 && !Character.isDigit(s.charAt(i)))
                return s.charAt(i) + "";
            if (Character.isDigit(s.charAt(i))) {
                len /= (s.charAt(i) - '0');
            } else len--;
        }
        return "";
    }
}