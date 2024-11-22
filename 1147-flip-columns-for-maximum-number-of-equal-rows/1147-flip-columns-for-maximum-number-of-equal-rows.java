class Solution {
    public int maxEqualRowsAfterFlips(int[][] mat) {
        int max = -1;
        Map<String, Integer> map = new HashMap<>();
        for (int row = 0; row < mat.length; row++) {
            int bit = mat[row][0];
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < mat[0].length; col++) {
                if(mat[row][col] == bit) sb.append("s");
                else {
                    bit = mat[row][col]; 
                    sb.append("b");
                }
            }
            String s = sb.toString();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for(String s : map.keySet()){
            max = Math.max(max, map.get(s));
        }
        return max;
    }
}