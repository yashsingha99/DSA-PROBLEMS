class Solution {
    public int openLock(String[] deadends, String target) {
       Set<String> st = new HashSet<>(Arrays.asList(deadends)); // for search quick in deadends
       if(st.contains("0000")) return -1;
       Queue<Pair<String, Integer>> q = new LinkedList<>(); // Integer  it represent level
       Set<String> vis = new HashSet<>();  // represent any string is visited or not
       vis.add("0000");
       q.offer(new Pair<>("0000", 0));
       while(!q.isEmpty()){

         Pair<String, Integer> curr = q.poll();
         String currStr = curr.getKey();
         int level = curr.getValue();
         if(currStr.equals(target)) return level;

         for(int i = 0; i < 4; i++){
            for(int j : new int[]{-1, 1}){
                int newDig = (currStr.charAt(i) - '0' + j + 10) % 10; // add one , sub one accor to circle( 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 0)
                String newStr = currStr.substring(0, i) + newDig  + currStr.substring(i+1);  // create new string after change 
                if(!vis.contains(newStr) && !st.contains(newStr)){ // check all base cond.
                    vis.add(newStr);
                    q.offer(new Pair<>(newStr, level+1)); // then incr level
                }
            }
         }
       }
       return -1;
    }
}