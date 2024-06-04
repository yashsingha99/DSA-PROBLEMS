class Solution {
    public int longestPalindrome(String s) {
        int arr[] = new int[123], cnt = 0, n = s.length();
        for(char c : s.toCharArray())
            arr[c]++;
        for(int i : arr)
          if(i > 0 && i % 2 != 0) cnt++;
        if(cnt == 0) return n;
        return n - cnt + 1;
    }
}