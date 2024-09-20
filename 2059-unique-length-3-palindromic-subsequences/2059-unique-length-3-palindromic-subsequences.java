class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length(), cnt = 0;
        int[][] pre = new int[26][2];
        for (int i = 0; i < n; i++) {
            if (pre[s.charAt(i) - 'a'][0] == 0)
                pre[s.charAt(i) - 'a'][0] = i + 1;
            pre[s.charAt(i) - 'a'][1] = i + 1;
        }
        for (int k = 0; k < 26; k++) {
            int left = pre[k][0] - 1;
            int right = pre[k][1] - 1;
            if(left == -1) continue;
            Set<Character> set = new HashSet<>();
            for(int i = left  + 1; i <= right - 1; i++){
                set.add(s.charAt(i));
            }
            cnt += set.size();
        }
        return cnt;
    }
}