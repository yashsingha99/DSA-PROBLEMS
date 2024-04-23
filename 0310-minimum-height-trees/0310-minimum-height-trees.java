class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        if(n == 1){ res.add(0); return res;}
        Map<Integer, List<Integer>> map = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        int ind[] = new int[n];
        for (int edge[] : edges) {
            // track all indegree
            ind[edge[0]]++;   
            ind[edge[1]]++;

            //construct adjecency list graph
            map.putIfAbsent(edge[0], new ArrayList<>());
            map.putIfAbsent(edge[1], new ArrayList<>());
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        for (int i = 0; i < ind.length; i++) {
            if (ind[i] == 1)
                q.offer(i);  // retrive all leaf nodes
        }
        while (n > 2) {  // (n > 2) beacuse center nodes can be either one or two
            int size = q.size();
            n -= size;  // remove layer mean remove leaf node,  enter second layer means enter just neighbour of leaf
            while (size-- > 0) {
                int elem = q.poll(); // remove leaf
                for (int i : map.get(elem)) {  // retrive all adjecent node of removed node
                    ind[i]--; // firstly decr by one its indegree
                    if (ind[i] == 1) // then check
                        q.offer(i); // put them if leaf
                }
            }
        }
        while (!q.isEmpty())
            res.add(q.poll());
        return res;
    }
}