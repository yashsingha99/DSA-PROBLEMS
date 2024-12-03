class Solution {
    public String addSpaces(String s, int[] spaces) {
        char[] c = s.toCharArray();
        int n = s.length(), cnt = 0, j = 0, idx = 0;
        char[] res = new char[n + spaces.length];
        for(int i = 0; i < n; i++){
            if(j < spaces.length && i == spaces[j]){
                res[idx++] = ' '; j++;
            }
            res[idx++] = c[i];
        }
        return new String(res);
    }
}