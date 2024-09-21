class Solution {
    List<Integer> ans = new ArrayList<>();
    void make(int n, int t){
        if(t > n) return;
        ans.add(t);
        for(int i = 0; i <= 9; i++){
            if(t * 10 + i > n) break;
            make(n, t * 10 + i);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        for(int i = 1; i <= 9; i++){
            if(i > n) break;
           make(n, i);
        }
        return ans;
    }
}