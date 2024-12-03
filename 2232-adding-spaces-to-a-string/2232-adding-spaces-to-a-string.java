class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int n = s.length(), cnt = 0;
        sb.append(s);
        for(int i = 0; i < spaces.length; i++){
             sb.insert(spaces[i] + cnt, " ");
             cnt++;
        }
        return sb.toString();
    }
}