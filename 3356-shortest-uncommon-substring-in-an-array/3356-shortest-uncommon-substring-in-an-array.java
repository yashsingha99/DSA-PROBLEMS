class Solution {
    public String[] shortestSubstrings(String[] arr) {
        int n = arr.length;
        Map<String, Integer> map = new HashMap<>();
        for(int k = 0; k < n; k++){
            String s = arr[k];
            int len = s.length();
            Set<String> set = new HashSet<>();
            for(int i = 0; i < len; i++){
                for(int j = i + 1; j <= len; j++){
                    String t = s.substring(i, j);
                    if(!set.contains(t)){
                       map.put(t, map.getOrDefault(t, 0) + 1); 
                       set.add(t);
                    }
                }
            }
        } 
        String[] ans = new String[n];
        for(int k = 0; k < n; k++){
            String s = arr[k];
            int len = s.length();
            String shortest = "";
            for(int i = 0; i < len; i++){
                for(int j = i + 1; j <= len; j++){
                    String t = s.substring(i, j);
                   if(map.get(t) == 1 && (shortest.equals("") || shortest.length() > t.length()|| (shortest.length() == t.length() && (t.compareTo(shortest) < 0)  ) )){
                    shortest = t;
                   }
                }
            }
            ans[k] = shortest;
        }
        return ans;
    }
}