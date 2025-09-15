class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int ans = 0;
        String[] str = text.split(" ");
        for(String s : str){
            boolean isTextable = true;
            for(char ch : brokenLetters.toCharArray()){
                if(s.indexOf(ch) != -1){
                   isTextable = false;
                   break;
                }
            }
            if(isTextable) ans++;
        }
        return ans;
    }
}