class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int A[] : flowers){
            map.put(A[0], map.getOrDefault(A[0], 0) + 1);
            map.put(A[1] + 1, map.getOrDefault(A[1] + 1, 0) - 1);
        } 
        TreeMap<Integer, Integer> tree = new TreeMap<>(map);
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(tree.entrySet());

        int mapSize = map.size();
        int n = people.length;
        int[][] pSorted = new int[n][2];
        for(int i = 0; i < n; i++){
           pSorted[i][0] = i;
           pSorted[i][1] = people[i];
        }

        Arrays.sort(pSorted, (a, b) -> a[1] - b[1]);
        int idx = 0, cnt = 0, j = 0, len = list.size();

        int[] res = new int[n];
        for(int i = 0; i < pSorted.length; i++){
            
            while(j < len && list.get(j).getKey() <= pSorted[i][1]){
                cnt += list.get(j).getValue(); j++;
               
            }
             res[pSorted[i][0]] = cnt;
            
        }
        return res;

    }
}