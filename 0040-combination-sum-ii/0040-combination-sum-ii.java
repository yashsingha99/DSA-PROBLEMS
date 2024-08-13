class Solution {
    void solve(int[]cand, int tar, int i, List<Integer> temp, List<List<Integer>> res){
        if(tar < 0)
          return;
        if(tar == 0){
          res.add(new ArrayList<>(temp));
          return;
        }
      
        for(int k = i; k < cand.length; k++){
            if(k > i && cand[k] == cand[k - 1]) continue;
              temp.add(cand[k]);
              solve(cand, tar - cand[k], k + 1,  temp, res);
              temp.remove(temp.size() - 1);
        }
    } 
    public List<List<Integer>> combinationSum2(int[] cand, int tar) {
        Arrays.sort(cand);
        List<List<Integer>> res = new ArrayList<>();
        solve(cand, tar, 0, new ArrayList<>(), res);
        return res;
    }
}