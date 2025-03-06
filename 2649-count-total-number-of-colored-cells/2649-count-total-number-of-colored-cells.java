class Solution {
    long find(int n, int cnt){
        if(n == 1) return cnt;
        // cnt += (n - 1);
        return (long) 4 * (n - 1) + find(n - 1, cnt);
    }
    public long coloredCells(int n) {
        if(n == 1) return 1;
        return find(n, 1);
    }
}