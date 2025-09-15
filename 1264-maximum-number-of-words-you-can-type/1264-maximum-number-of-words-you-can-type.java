class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int ans = 0;
        String[] str = text.split(" ");
        int[] fq = new int[26];
        for(char ch : brokenLetters.toCharArray()){
            fq[ch - 'a']++;
        }
        for(String s : str){
            boolean isTextable = true;
            for(char ch : s.toCharArray()){
               if(fq[ch - 'a'] != 0){
                  isTextable = false;
                  break;
               }
            }
            if(isTextable) ans++;
        }
        return ans;
    }
}