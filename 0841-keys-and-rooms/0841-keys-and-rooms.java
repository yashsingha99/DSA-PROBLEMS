class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int size = rooms.size();
        boolean vis[] = new boolean[size];
        Stack<Integer> st = new Stack<>();
        vis[0] = true;
        st.push(0);
        while (!st.empty()) {
            int idx = st.pop();
            for (int num : rooms.get(idx)) 
                if (!vis[num]) {
                    st.push(num);
                    vis[num] = true;
                }
        }
        for (int i = 0; i < size; i++)
            if (!vis[i])
                return false;
        return true;
    }
}