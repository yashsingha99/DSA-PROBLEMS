class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        int[] arr1 = new int[26], arr2 = new int[26];
        int n = s.length();
        for (int i = n - 1; i >= 0; i--){
            if (arr2[s.charAt(i) - 'a'] == 0)
                arr2[s.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < n; i++) {
            if (arr1[s.charAt(i) - 'a'] == 1) continue;
            while (!st.empty() && st.peek() > s.charAt(i) && arr2[st.peek() - 'a'] > i) {
                arr1[st.pop() - 'a'] = 0;
            }
                arr1[s.charAt(i) - 'a'] = 1;
                st.push(s.charAt(i));
        }
        String ans = "";
        while (!st.empty())
            ans = st.pop() + ans;
        return ans;
    }
}