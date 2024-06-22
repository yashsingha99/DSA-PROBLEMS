class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0, res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0; i < n; i++){
            if(nums[i] % 2 != 0) cnt++;
            map.put(cnt, map.getOrDefault(cnt, 0) + 1);
            if(map.containsKey(cnt - k)) 
             res += map.get(cnt - k);
        }
        return res;
    }
}