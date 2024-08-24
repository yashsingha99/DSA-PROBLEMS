class Solution {
    void restore(String s, List<String> ans, String sb, int idx, int part, int n) {
        if (idx == n && part == 4) {
            ans.add(sb.substring(0, sb.length() - 1));
            return;
        }
        if (part >= 4)
            return;
        for (int i = idx; i < Math.min(idx + 3, n); i++) {
            String num = s.substring(idx, i + 1);
            if(Integer.parseInt(num) <= 255 && (i == idx || s.charAt(idx) != '0')) {
                restore(s, ans, sb + num + ".", i + 1, part + 1, n);
            }
        }
    }

    public List<String> restoreIpAddresses(String s) {
        int n = s.length();
        List<String> ans = new ArrayList<>();
        if (n > 12)
            return ans;
        restore(s, ans, "", 0, 0, n);
        return ans;
    }
}