class Solution {
    public String reverseWords(String s) {
        int n = s.length(), j = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                StringBuilder temp = new StringBuilder();
                String rev = temp.append(s.substring(j, i)).reverse().toString();
                sb.append(rev + " ");
                j = i + 1;
            } else if (i == n - 1) {
                StringBuilder temp = new StringBuilder();
                String rev = temp.append(s.substring(j, i + 1)).reverse().toString();
                sb.append(rev);
            }
        }
        return sb.toString();
    }
}