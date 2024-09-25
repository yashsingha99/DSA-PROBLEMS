class TrieNode{
    int fq = 0;
    TrieNode[] trieNode = new TrieNode[26];
} 

class Solution {
    void insert(TrieNode root, String s){
        for(char c : s.toCharArray()){
            if(root.trieNode[c - 'a'] == null){
                root.trieNode[c - 'a'] = new TrieNode();
            }
            root =  root.trieNode[c - 'a'];
            root.fq++;
        }
    }

    int compute(TrieNode root, String s){
       int cnt = 0;
       for(char c : s.toCharArray()){
          if(root.trieNode[c - 'a'] != null){
            root = root.trieNode[c - 'a'];
            cnt += root.fq;
          }
       }
        return cnt;
    }
    public int[] sumPrefixScores(String[] words) {
        int n = words.length;
        int[] ans = new int[n];
        TrieNode root = new TrieNode();
        for(String s : words){
            insert(root, s);
        }
        for(int i = 0; i < n; i++){
            ans[i] = compute(root, words[i]);
        }
        return ans;
    }
}