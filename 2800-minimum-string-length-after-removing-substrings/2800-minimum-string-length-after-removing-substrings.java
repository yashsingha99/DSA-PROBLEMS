class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder(s);
        int idx1 = sb.indexOf("AB");
        int idx2 = sb.indexOf("CD");
        while (idx1 != -1 || idx2 != -1) {
            if (idx1 != -1)
                sb.delete(idx1, idx1 + 2);
            idx2 = sb.indexOf("CD");
            if (idx2 != -1)
                sb.delete(idx2, idx2 + 2);
            idx1 = sb.indexOf("AB");
            idx2 = sb.indexOf("CD");
        }
        return sb.length();
    }
}