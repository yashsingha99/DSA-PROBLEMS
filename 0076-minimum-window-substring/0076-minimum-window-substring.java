class Solution {
    boolean check(int[] fq, int[] arr) {
        for (int i = 0; i < 52; i++) {
            if (fq[i] == 0)
                continue;
            if (fq[i] > arr[i])
                return false;
        }
        return true;
    }

    public String minWindow(String s, String t) {
        int n = s.length(), m = t.length();
        int[] fq = new int[52];
        for (char ch : t.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                fq[ch - 'A']++;
            } else {
                fq[ch - 'a' + 26]++;
            }
        }
        int i = 0, j = 0;
        StringBuilder minString = new StringBuilder();
        int min = Integer.MAX_VALUE;
        int[] arr = new int[52];
        while (j < n) {
            char ch = s.charAt(j);
            if (ch >= 'A' && ch <= 'Z') {
                arr[ch - 'A']++;
            } else {
                arr[ch - 'a' + 26]++;
            }
        //    System.out.println(check(fq, arr));

            while (i <= j && check(fq, arr)) {
                int window = (j - i + 1);
                if (min > window) {
                    minString = new StringBuilder(s.substring(i, j + 1));
                    min = window;
                }
                char ch2 = s.charAt(i);
                if (ch2 >= 'A' && ch2 <= 'Z') {
                    arr[ch2 - 'A']--;
                } else {
                    arr[ch2 - 'a' + 26]--;
                }
                i++;
            }
            j++;
        }

        return minString.toString();
    }
}