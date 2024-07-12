class Solution {
    void count(int open, int close, List<String> res, StringBuilder sb){
     if(close == 0){
         res.add(sb.toString());
         return;
     }
     if(open > 0) {
     count(open-1, close, res, sb.append('('));
     sb.deleteCharAt(sb.length()-1);
     }
     if(open < close) {
     count(open, close-1, res, sb.append(')'));
     sb.deleteCharAt(sb.length()-1);
     }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        count(n, n, res, new StringBuilder());
        return res;
    }
}