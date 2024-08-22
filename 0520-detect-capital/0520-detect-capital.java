class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length(), t1 = 1, t2 = 1;
        if(n == 1) return true;
        if(word.charAt(0) >= 'a' && word.charAt(0) <= 'z') t1 = 0;
        if(word.charAt(1) >= 'a' && word.charAt(1) <= 'z') t2 = 0;
        for(int i = 1; i < n; i++){
            char ch = word.charAt(i);
            if(t1 == 1){
                if(t2 == 1 && ch >= 'a' && ch <= 'z') return false;
                if(t2 == 0 && ch >= 'A' && ch <= 'Z') return false;
            }
            if( t1 == 0 && ch >= 'A' && ch <= 'Z')
              return false;
        }
        return true;
    }
}