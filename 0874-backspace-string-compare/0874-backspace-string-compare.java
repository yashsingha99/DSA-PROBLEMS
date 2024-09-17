class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '#' && st1.size() != 0) st1.pop();
            if(c != '#') st1.push(c);
        }
        for(char c : t.toCharArray()){
            if(c == '#' && st2.size() != 0) st2.pop();
            if(c != '#') st2.push(c);
        }

        return st1.toString().equals(st2.toString());
    }
}