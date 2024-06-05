class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        int n = words.length;
        int freq[][] = new int[26][n], idx = 0;
        for(String s : words){
            for(char c : s.toCharArray()){
                    freq[c - 'a'][idx]++;
            }  
            idx++; 
        }

        for(int i = 0; i < 26; i++){
            int min = 100, f = 0;
            for(int j = 0; j < n; j++){
                if(freq[i][j] ==  0) {
                    f = 1; break;
                }
                min = Math.min(min, freq[i][j]);
            }
            if(f == 0) 
            for(int j = 0; j < min; j++)
             ans.add( ((char) (97 + i)) + "");
        }
        return ans;
    }

}