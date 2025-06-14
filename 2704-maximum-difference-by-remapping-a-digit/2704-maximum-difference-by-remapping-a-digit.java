class Solution {
    public int minMaxDifference(int num) {
        StringBuilder numString = new StringBuilder(num+"");
        int n = numString.length();
        int maxChar = -1, minChar = numString.charAt(0) - '0';
        for(int i = 0; i < n; i++){
            if(numString.charAt(i) - '0' < 9) {
                maxChar = numString.charAt(i) - '0';
                break;
            }
        }
        int max = 0, min = 0;
        for(int i = 0; i < n; i++){
            int curr = numString.charAt(i) - '0';
            if(curr == maxChar){
                max = (max * 10) + 9;
            } else max = (max * 10) + curr;

            if(curr == minChar){
                min = (min * 10) + 0;
            } else min = (min * 10) + curr;
        }

        return max - min;

    }
}