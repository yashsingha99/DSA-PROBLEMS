class Solution {
    public int countConsistentStrings(String a, String[] words) {
        int cnt = 0;
         for(int i = 0; i < words.length; i++){
            boolean f = true;
             for(char c : words[i].toCharArray()){
                if(a.indexOf(c) == -1) {
                 f = false;
                  break;
                }
             }
             if(f) cnt++;
         }
         return cnt;
    }
}