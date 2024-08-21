class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);
            if(st.isEmpty()) {
                st.push(c);
                continue;
            }
             char ch = st.peek();
            if(ch == c - 32 || ch == c + 32)
              st.pop();
            else st.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0, st.pop());
        }
        // System.out.print(st);
        return sb.toString();
    }
}