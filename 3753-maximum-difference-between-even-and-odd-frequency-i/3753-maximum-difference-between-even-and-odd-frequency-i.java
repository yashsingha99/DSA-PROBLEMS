class Solution {
    public int maxDifference(String s) {
        int n = s.length(), maxEven = (int)1e9, maxOdd = -1, max = -1;
        int[] arr = new int[26];
        for (int i : s.toCharArray()) {
            arr[i - 'a']++;
        }
        for (int i : arr) {
            if(i == 0) continue;
            if (i % 2 == 0)
                maxEven = Math.min(maxEven, i);
            else
                maxOdd = Math.max(maxOdd, i);
        }
        return maxOdd - maxEven;
    }
}