class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] A : edges){
            map.put(A[0], map.getOrDefault(A[0], 0) + 1);
            map.put(A[1], map.getOrDefault(A[1], 0) + 1);
        } 
        for(int key : map.keySet()){
            if(map.get(key) == n) return key;
        }
        return n;
    }
}