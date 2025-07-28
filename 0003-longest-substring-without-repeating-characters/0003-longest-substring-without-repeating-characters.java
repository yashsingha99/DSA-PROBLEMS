class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        for(int j = 0; j < n; j++){
            char cur = s.charAt(j);
            if(map.containsKey(cur)){
                i = Math.max(i, map.get(cur) + 1);
                map.remove(cur);
            }
            map.put(cur, j);
            max = Math.max(max, (j - i + 1));
        }
        return max;
    }
}