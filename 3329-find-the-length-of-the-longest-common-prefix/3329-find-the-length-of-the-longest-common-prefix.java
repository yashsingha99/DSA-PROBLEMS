class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for(int num : arr1){
            while(num != 0){
                if(!set.contains(num))
                  set.add(num);
                num /= 10;
            }
        }
        for(int num : arr2){
            while(num != 0){
                if(set.contains(num)){
                  ans = Math.max(ans, (int)Math.log10(num) + 1);
                }
                num /= 10;
            }
        }
        return ans;
    }
}