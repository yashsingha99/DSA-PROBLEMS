class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans = new ArrayList<>();
        int n = words.length;
        for(int i = 0; i < n - 1; i++){
            if(groups[i] == groups[i + 1]) continue;
            ans.add(words[i]);
        }
        ans.add(words[n - 1]);
        return ans;
    }
}