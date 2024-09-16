class Solution {
    public int findMinDifference(List<String> tP) {
        int n = tP.size();
        int minimum = Integer.MAX_VALUE;
        int minutes [] = new int[n];
        for(int i = 0; i < n; i++) {
            int hr = Integer.parseInt(tP.get(i).substring(0, 2));
            int min = Integer.parseInt(tP.get(i).substring(3, 5));
            minutes [i] = (hr * 60) + min;
        }
        Arrays.sort(minutes);
        for(int i = 0; i < n - 1; i++){
            minimum = Math.min(minimum, minutes[i + 1] - minutes[i]);
        }
                                // total minutes - last bigger minutes
        return Math.min(minimum, (24 * 60) - minutes[n - 1] + minutes[0]);
    }
}