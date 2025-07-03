class Solution {

    int dfs(int cur, Map<Integer, List<Integer>> adj, int d, int p) {
        if (d < 0)
            return 0;
        int cnt = 1;
        for (int neigh : adj.getOrDefault(cur, new ArrayList<>())) {
            if (neigh != p) {
                cnt += dfs(neigh, adj, d - 1, cur);
            }
        }
        return cnt;
    }

    int[] findCount(int[][] edges, int k) {
        int N = edges.length + 1;
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (int A[] : edges) {
            int u = A[0];
            int v = A[1];
            if (!adj.containsKey(u))
                adj.put(u, new ArrayList<>());
            adj.get(u).add(v);

            if (!adj.containsKey(v))
                adj.put(v, new ArrayList<>());
            adj.get(v).add(u);
        }

        int[] res = new int[N];

        for (int i = 0; i < N; i++) {
            res[i] = dfs(i, adj, k, -1);
        }
        return res;
    }

    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        int[] res1 = findCount(edges1, k);
        int[] res2 = findCount(edges2, k - 1);
        int N = edges1.length + 1;
        int max = Arrays.stream(res2).max().getAsInt();

        for (int i = 0; i < N; i++) {
            res1[i] += max;
        }
        return res1;
    }
}