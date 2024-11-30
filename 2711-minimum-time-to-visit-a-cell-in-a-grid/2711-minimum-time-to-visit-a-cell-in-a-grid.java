class Solution {
    public int minimumTime(int[][] grid) {
       int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
       if(grid[0][1] > 1 && grid[1][0] > 1) return -1;
       int n = grid.length, m = grid[0].length;
       PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[2] - b[2]);
       q.add(new int[]{0, 0, 0});
       boolean[][] vis = new boolean[n][m];
       vis[0][0] = true;
       while(!q.isEmpty()){
            int[] arr = q.poll();
            int row = arr[0];
            int col = arr[1];
            int time = arr[2];

            for(int A[] : dir){
                int currRow = row +  A[0];
                int currCol = col + A[1];
                if(currRow < 0 || currRow  >= n || currCol < 0 || currCol >= m || vis[currRow][currCol])  continue;
                int currTime = time + 1;
                if(grid[currRow][currCol] > currTime){
                    currTime = ((grid[currRow][currCol] - time) & 1) != 0 ? grid[currRow][currCol] : grid[currRow][currCol] + 1;
                }
                if(currRow == n - 1 && currCol == m - 1) return currTime;
                q.add(new int[]{currRow, currCol, currTime});
                vis[currRow][currCol] = true; 
            }
       }
       return -1;
    }
}