class Solution {
    public boolean isPossible(int[] arr, int m , int k, int bloom){
        int count = 0,ans = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] <= bloom) 
               count++;
            else
            {
               ans += count/k;
               count = 0;
            }
        }
        ans += count/k;
        return ans >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if( m * k > n) return -1;
        int high = -1, low = Integer.MAX_VALUE, mid = 0,ans = -1;
        for(int i = 0; i < n; i++){
            high = Math.max(high , bloomDay[i]);
            low = Math.min(low , bloomDay[i]);
        }
        while(low <= high){
            mid = (low + high)/2;
            if(isPossible(bloomDay , m , k , mid)){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
}