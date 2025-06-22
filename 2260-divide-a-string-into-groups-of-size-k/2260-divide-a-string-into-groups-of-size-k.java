class Solution {
    public String[] divideString(String s, int k, char fill) {
        StringBuilder sb = new StringBuilder(s);
        int sbNeed = k - sb.length();
        while(sb.length() % k != 0){
            sb.append(fill);
        }
        int len = sb.length();
        String[] ans = new String[len / k];
        for (int i = 0; i < len / k; i++) {
            ans[i] = sb.substring(i * k, (i + 1) * k);
        }

        return ans;
    }
}