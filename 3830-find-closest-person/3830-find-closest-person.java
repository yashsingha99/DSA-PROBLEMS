class Solution {
    public int findClosest(int x, int y, int z) {
        int destX = Math.abs(x - z);
        int destY = Math.abs(y - z);
        if(destX == destY) return 0;
        return destX > destY ? 2 : 1;
    }
}