class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] ans = arr.clone();
        Arrays.sort(ans);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : ans) 
            map.put(i, map.getOrDefault(i, map.size() + 1));
        for(int i = 0; i < n; i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}