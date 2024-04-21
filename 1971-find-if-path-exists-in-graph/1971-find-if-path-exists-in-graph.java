class Solution {
    boolean help(Map<Integer, List<Integer>> map , int s, int d, Set<Integer> v){
        if(s == d) return true;
        v.add(s);
        for(int i : map.getOrDefault(s, new ArrayList<>())){
            if(!v.contains(i))
              if(help(map, i, d, v)) return true;
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int s, int d) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int A[] : edges){
           map.computeIfAbsent(A[0], k -> new ArrayList<>()).add(A[1]);
           map.computeIfAbsent(A[1], k -> new ArrayList<>()).add(A[0]);
        }
        Set<Integer> v = new HashSet<>();
        return help(map, s, d, v);
    }
}