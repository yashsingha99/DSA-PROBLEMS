class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, n = s.length();
        for(int i = 0; i < n; i++){
            Set<Character> set = new HashSet<>();
            for(int j = i; j < n; j++){
               char cur = s.charAt(j);
               if(set.contains(cur)) break;
               set.add(cur);
               max = Math.max(max, (j - i + 1));
            }
        }
        return max;
    }
}