class Solution {
    boolean isPalindrome(String s){
        int n = s.length();
        for(int i = 0; i < n; i++)
          if(s.charAt(i) != s.charAt(n - i -1)) return false;
        return true;
    }
    public String shortestPalindrome(String s) {
        int n = s.length(), i = n - 1;
        for(i = n - 1; i >= 0; i--)
            if(isPalindrome(s.substring(0, i + 1))) break;
        StringBuilder sb = new StringBuilder(s.substring(i + 1));
        sb.reverse();
        return sb.toString() + s;
    }
}