class Solution {
    public int minTimeToVisitAllPoints(int[][] p) {
        int time = 0;

        for(int i = 0; i < p.length - 1; i++){
            int d1 = Math.abs(p[i][0] - p[i + 1][0]); 
            int d2 = Math.abs(p[i][1] - p[i + 1][1]);
            time += Math.max(d1, d2);
        }
        return time;
    }
}