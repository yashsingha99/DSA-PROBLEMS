class Solution {
    public int findLucky(int[] arr) {
        int maxNum = Arrays.stream(arr).max().getAsInt();
        int fq[] = new int[maxNum + 1];
        for(int i : arr) fq[i]++;

        for(int i = maxNum; i > 0; i--){
            if(fq[i] == i ) return i;
        }
        return -1;
    }
}