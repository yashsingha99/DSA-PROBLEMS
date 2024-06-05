class Solution {
    public boolean isRobotBounded(String inst) {
      int[] xDir = {1, 0, -1, 0}, yDir = {0, -1, 0, 1};
      int x = 0, y = 0, dir = 0;
      for(char c : inst.toCharArray()){
        if(c == 'G'){
            x += xDir[dir];
            y += yDir[dir];
        } else if(c == 'L'){
            dir++;
            if(dir == 4) dir = 0;
        } else {
            dir--;
            if(dir == -1) dir = 3;
        }
      }
      return x == 0 && y == 0 || dir != 0;
    }
}