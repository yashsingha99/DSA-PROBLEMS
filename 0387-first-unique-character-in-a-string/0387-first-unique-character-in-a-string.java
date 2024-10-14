class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        int[] fq = new int[26];
        for(char c : s.toCharArray()){
            fq[c - 'a']++;
        }
        for(int i = 0; i < n; i++)
          if(fq[s.charAt(i) - 'a'] == 1) return i;
        return -1;
    }
}