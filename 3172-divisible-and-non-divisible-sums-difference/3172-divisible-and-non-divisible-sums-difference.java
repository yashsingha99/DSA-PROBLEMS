class Solution {
    public int differenceOfSums(int n, int m) {
         int total = ( n * (n + 1) ) / 2;
         int k = n / m;
         return (total -  (k * (k + 1)) * m);
    }
}