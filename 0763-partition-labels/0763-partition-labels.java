class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        int last[] = new int[26], n = s.length();
        for(int i = 0; i < n; i++)
           last[s.charAt(i) - 'a'] = i;
        int j = 0, cut = 0;
        for(int i = 0; i < n; i++){
          j = Math.max(j, last[s.charAt(i) - 'a']);
          if(i == j){
            ans.add(j + 1 - cut);
            cut = i + 1;
          }
        }             
        return ans;
    }
}