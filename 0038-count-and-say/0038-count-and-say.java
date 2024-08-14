class Solution {
    public String countAndSay(int n) {
        String res = "", num = "1";
        for (int k = 0; k < n - 1; k++) {
            StringBuilder sb = new StringBuilder();
            char same = num.charAt(0);
            int cnt = 0, len = num.length();
            for (int i = 0; i < len; i++) {
                if (same == num.charAt(i))
                    cnt++;
                else {
                    sb.append(cnt + "");
                    sb.append(same);
                    cnt = 1;
                    same = num.charAt(i);
                }
            }
            sb.append(cnt + "");
            sb.append(same);
            num = sb.toString();
            // System.out.println(num);
        }
        return num;
    }
}