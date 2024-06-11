class Solution {
    public int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\."), ver2 = version2.split("\\.");
        int n = ver1.length, m = ver2.length;
        for(int i = 0; i < Math.max(n, m); i++){
            int num1 = i < n ? Integer.parseInt(ver1[i]) : 0;
            int num2 = i < m ? Integer.parseInt(ver2[i]) : 0;
            if(num1 < num2) return -1;
            else if(num1 > num2) return 1; 
        }
        return 0;
    }
}