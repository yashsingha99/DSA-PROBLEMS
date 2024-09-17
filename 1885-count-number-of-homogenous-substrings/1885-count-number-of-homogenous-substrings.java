class Solution {
    public int countHomogenous(String s) {
        char temp = s.charAt(0);
        int ans = 0, n = s.length(), cnt = 0, MOD = (int) 1e9 + 7;
        for (int i = 0; i < n; i++) {
            if (temp == s.charAt(i))
                cnt++;
            else {
                ans = (ans + (int) ((long) cnt * (cnt + 1) / 2 % MOD)) % MOD;
                cnt = 1;
                temp = s.charAt(i);
            }
        }
        ans = (ans + (int) ((long) cnt * (cnt + 1) / 2 % MOD)) % MOD;
        return ans;

    }
}