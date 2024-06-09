class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      int map[] = new int[k + 1];
      int ans = 0, sum = 0;
      map[0] = 1;
      for(int i : nums){
        sum += i;
        int rem = (sum % k);
        if(rem < 0) rem += k;
        if(map[rem] != 0)
          ans += map[rem];
        map[rem]++;
      }
      return ans;
    }
}