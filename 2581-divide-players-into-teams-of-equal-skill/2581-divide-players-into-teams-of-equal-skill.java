class Solution {
    public long dividePlayers(int[] skill) {
        int sum = 0, totalTeams = skill.length / 2;
        int fq[] = new int[1001];
        for(int i : skill){
            sum += i;
            fq[i]++;
        }

        if(sum % totalTeams != 0) return -1;
        int skillSet = sum / totalTeams;
        long res = 0;
        for(int i : skill){
            if(fq[i] == 0) continue;
            fq[i]--;
            if(fq[skillSet - i] == 0) return -1;
            fq[skillSet - i]--;
            res += (long) (i) * (long)(skillSet - i);
        }
        return res;
    }
}