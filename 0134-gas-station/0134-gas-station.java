class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, cnt = 0, pos = -1;
        for(int i = 0; i < gas.length; i++){
            int diff = gas[i] - cost[i];
            cnt += diff;
            total += diff;
            if(cnt < 0){
               pos = i;
               cnt = 0;
            }
        }
        if(total >= 0) return pos + 1;
        return -1;
    }
}