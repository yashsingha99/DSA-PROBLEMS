class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
       
        List<Integer> ans = new ArrayList<>();
        int cnt = -1;
        for(int i = 0; i < n; i++){
            if(nums[i] == key){
                cnt = i + k;
            }
            if(i <= cnt && !ans.contains(i)) ans.add(i);
        }
        cnt = n + 1;
        for(int i = n - 1; i >= 0; i--){
            if(nums[i] == key){
                cnt = i - k;
            }
            if(i >= cnt && !ans.contains(i)) ans.add(i);
        }
        Collections.sort(ans);
        return ans;
    }
}