class Solution {
    public boolean buddyStrings(String s, String goal) {
        int n1 = s.length(), n2 = goal.length();
        if (n1 != n2) return false;

        if (s.equals(goal)) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
                if (count[c - 'a'] > 1) {
                    return true;  
                }
            }
            return false;  
        }

        int first = -1, second = -1;
        for (int i = 0; i < n1; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false;
                }
            }
        }

        return (second != -1 &&
                s.charAt(first) == goal.charAt(second) &&
                s.charAt(second) == goal.charAt(first));
    }
}
