class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1 = s.length() - 1, n2 = t.length() - 1;
        while(n1 >= 0 && n2 >= 0){
          if(s.charAt(n1) == t.charAt(n2)) n1--;
          n2--;
        }
        return n1 == -1;
    }
}