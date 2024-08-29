class Solution {
    public boolean repeatedSubstringPattern(String s) { 
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n/2; i++){
            sb.append(s.charAt(i));
            if(n % sb.length() != 0) continue;
            StringBuilder sb2 = new StringBuilder(sb);

            while(n != sb2.length()) sb2.append(sb);
            if(s.equals(sb2.toString())) return true;
        }
        return false;
    }
}