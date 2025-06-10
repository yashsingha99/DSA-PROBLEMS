class Solution {
    public int maxDifference(String s) {
        int n = s.length();
        int[] num = new int[26];
        for (char c : s.toCharArray())
            num[c - 'a']++;
        int maxO = -1, minE = 101;
        for (int i : num) {
            if(i == 0) continue;
            if (i % 2 == 0) {
                minE = Math.min(minE, i); 
            } else {
                maxO = Math.max(maxO, i); 
            }
        }
        return (maxO - minE);
    }
}