class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        int cnt = 0;
        for(char ch : s.toCharArray()){
            if(st.isEmpty()){
                if(Character.isDigit(ch)){
                  cnt++; 
                } else if(cnt > 0) {
                  cnt--;

                } else {
                   st.push(ch);
                }

            } else { 
                if(Character.isDigit(ch)){
                   st.pop(); 
                } else {
                   st.push(ch);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        System.out.print(st);
        while(!st.isEmpty()){
            sb.insert(0, st.pop());
        }
        return sb.toString();
    }
}