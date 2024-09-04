class Solution {
    private static final int HASH_MULTIPLIER = 60001;

    private int hashCoordinates(int x, int y) {
        return x + HASH_MULTIPLIER * y;
    }

    public int robotSim(int[] com, int[][] ob) {
        int x = 0, y = 0, max = Integer.MIN_VALUE;
        int nC = com.length, nO = ob.length, dirI = 0;
        int dirX[] = { 0, 1, 0, -1 };
        int dirY[] = { 1, 0, -1, 0 };
        Set<Integer> set = new HashSet<>();
        for (int A[] : ob) {
            set.add(hashCoordinates(A[0], A[1]));
        }
        for (int i = 0; i < nC; i++) {
            if (com[i] == -1)
                dirI = (dirI + 1) % 4;
            else if (com[i] == -2){
                dirI = (dirI + 3) % 4;
            }
            else {
                int t = com[i];
                while (t-- > 0) {
                    if (set.contains(hashCoordinates(x + dirX[dirI], y + dirY[dirI])))
                            break;
                    x += dirX[dirI];
                    y += dirY[dirI];
                }
            }
            max = Math.max(max, (int) (x * x) + (y * y));
        }
        return max;
    }
}