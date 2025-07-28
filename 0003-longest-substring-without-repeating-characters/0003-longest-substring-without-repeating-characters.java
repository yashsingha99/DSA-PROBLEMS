class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, n = s.length();
        Set<Character> set = new HashSet<>();
        int i = 0;
        for(int j = 0; j < n; j++){
            char cur = s.charAt(j);
            while(i < j && set.contains(cur)){
                set.remove(s.charAt(i++));
            }
            set.add(cur);
            max = Math.max(max, (j - i + 1));
        }
        return max;
    }
}