class Solution {
    public int possibleStringCount(String word) {
        int ans = 1, n = word.length();
          for(int i = 1; i < n; i++){
            if(word.charAt(i) == word.charAt(i - 1)) ans++;
          }
          return ans;
    }
}