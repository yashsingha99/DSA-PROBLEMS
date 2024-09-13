class Solution {
    public int[] xorQueries(int[] arr, int[][] q) {
        int n1 = q.length;
        int n2 = arr.length;
        int[] bank = new int[n2];
        int[] ans = new int[n1];
        bank[0] = arr[0];
        for(int i = 1; i < n2; i++){
          bank[i] = bank[i - 1] ^ arr[i];
        }
        for(int i = 0; i < n1; i++){
            if(q[i][0] == 0){
                ans[i] = bank[q[i][1]];
            } else 
            ans[i] = bank[q[i][0] - 1] ^ bank[q[i][1]];
        }
        return ans;
    }
}