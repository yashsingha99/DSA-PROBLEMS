class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      Map<Integer, Integer> map = new HashMap<>();
      int ans = 0, sum = 0;
      map.put(0, 1);
      for(int i : nums){
        sum += i;
        int rem = (sum % k);
        if(rem < 0) rem += k;
        if(map.containsKey(rem))
          ans += map.get(rem);
        map.put(rem, map.getOrDefault(rem, 0) + 1);
      }
      return ans;
    }
}