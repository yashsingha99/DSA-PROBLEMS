class Solution {
    public int numberOfSubstrings(String s) {
        int i = 0, j = 0, n = s.length(), ans = 0;
        int[] abc = new int[3];
        while (j < n) {
            char c = s.charAt(j);
            abc[c - 'a']++;
            while (abc[0] > 0 && abc[1] > 0 && abc[2] > 0) {
                ans += (n - j);
                if (abc[s.charAt(i) - 'a'] > 0)
                    abc[s.charAt(i) - 'a']--;
                i++;
            }

            j++;
        }

        return ans;
    }
}