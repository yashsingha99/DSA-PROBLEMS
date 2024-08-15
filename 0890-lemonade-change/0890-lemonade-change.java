class Solution {
    public boolean lemonadeChange(int[] bills) {
        int totalFive = 0, totalTen = 0;
        for(int i : bills){
            if(i == 5){
                totalFive++;
            }
            else if(i == 10){
                if(totalFive > 0){
                    totalFive--;
                    totalTen++;
                }
                else return false;
            }
            else {
                if(totalFive > 0 && totalTen > 0){
                     totalFive--;
                     totalTen--;
                } else if(totalFive >= 3) {
                    totalFive -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}