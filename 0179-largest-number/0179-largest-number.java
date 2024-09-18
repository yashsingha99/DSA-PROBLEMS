class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] maxLen = new String[n];
        for (int i = 0; i < n; i++) {
            maxLen[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(maxLen, (b, a) -> {
            String s1 = a + b;
            String s2 = b + a;
            return s1.compareTo(s2);
        });
        if (maxLen[0].equals("0"))
            return "0";
        String ans = "";
        for (String i : maxLen) {
            ans += i;
        }
        return ans;
    }
}