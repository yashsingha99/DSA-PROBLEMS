class Solution {
    public boolean judgeSquareSum(int c) {
        long h = (long) Math.sqrt(c), l = 0;
        while(l <= h){
            if((h * h) + (l * l) == c)
              return true;
            else if((h * h) + (l * l) > c)
              h--;
            else l++;
        }
        return false;
    }
}