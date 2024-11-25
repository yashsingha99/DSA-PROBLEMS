class Solution {
    String swap(String str, int i, int j) {
        char chars[] = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }

    public int slidingPuzzle(int[][] board) {
        int dir[][] = { { 1, 3 }, { 0, 2, 4 }, { 1, 5 }, { 0, 4 }, { 1, 3, 5 }, { 2, 4 } };
        String target = "123450";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            sb.append(board[i][0]);
            sb.append(board[i][1]);
            sb.append(board[i][2]);
        }
        Queue<String> q = new LinkedList<>();
        Set<String> vis = new HashSet<>();
        q.add(sb.toString());
        vis.add(sb.toString());
        int move = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                String curr = q.poll();
                if (curr.equals(target))
                    return move;
                int zeroPos = curr.indexOf('0');
                for (int currZeroPos : dir[zeroPos]) {
                    String nextState = swap(curr, zeroPos, currZeroPos);
                    if (vis.contains(nextState))
                        continue;
                    q.add(nextState);
                    vis.add(nextState);
                }
            }
            move++;
        }
        return -1;
    }
}