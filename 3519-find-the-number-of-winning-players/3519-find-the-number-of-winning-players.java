class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int cnt = 0, len = pick.length;   
        for(int i = 0; i < len; i++){   
            if(!map.containsKey(pick[i][0])){
                List<Integer> temp = new ArrayList<>();
                temp.add(pick[i][1]);
                map.put(pick[i][0], temp); 
            } else { 
                map.get(pick[i][0]).add(pick[i][1]);
            }
        }
        System.out.print(map);
        for(int i : map.keySet()){
            int arr[] = new int[11];
            for(int l : map.get(i)){
                arr[l]++;
                if(arr[l] > i){
                   cnt++; break;
                }
            }
        }              
        return cnt;   
    }
}