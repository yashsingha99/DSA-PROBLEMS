class Solution {
    boolean isValid(int a, int b){
        if(a == b) return true;
        char[] str = String.valueOf(b).toCharArray();
        int n = str.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                if(Integer.parseInt(new String(str)) == a) return true;
                temp = str[i];
                str[i] = str[j];
                str[j] = temp;
            } 
        }
        return false;
    }
    public int countPairs(int[] nums) {
        int n  = nums.length, res = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(isValid(nums[i], nums[j]) || isValid(nums[j], nums[i]))
                res++;
            }
        }
        return res;
    }
}