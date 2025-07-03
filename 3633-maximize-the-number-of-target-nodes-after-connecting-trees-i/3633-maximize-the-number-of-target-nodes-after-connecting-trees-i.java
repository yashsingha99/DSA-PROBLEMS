class Solution {

    private int dfs(int curr, Map<Integer, List<Integer>> adj, int d, int parent) {
        if (d < 0)
            return 0;

        int count = 1;

        for (int neighbor : adj.getOrDefault(curr, new ArrayList<>())) {
            if (neighbor != parent) {
                count += dfs(neighbor, adj, d - 1, curr);
            }
        }

        return count;
    }

    private int[] findCount(int[][] edges, int d) {
        int N = edges.length + 1;
        Map<Integer, List<Integer>> adj = new HashMap<>();

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (!adj.containsKey(u))
                adj.put(u, new ArrayList<>());
            adj.get(u).add(v);

            if (!adj.containsKey(v))
                adj.put(v, new ArrayList<>());
            adj.get(v).add(u);

        }

        int[] res = new int[N];
        for (int i = 0; i < N; i++) {
            res[i] = dfs(i, adj, d, -1);
        }

        return res;
    }

    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        int N = edges1.length + 1;

        int[] res1 = findCount(edges1, k);
        int[] res2 = findCount(edges2, k - 1);

        int max = Arrays.stream(res2).max().getAsInt();

        for (int i = 0; i < N; i++) {
            res1[i] += max;
        }

        return res1;
    }
}