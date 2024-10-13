class Solution {
    public int finalPositionOfSnake(int n, List<String> list) {
        int move = 0;
        for(String s : list){
            if(s.equals("DOWN")) move += n;
            if(s.equals("UP")) move -= n;
            if(s.equals("RIGHT")) move++;
            if(s.equals("LEFT")) move--;
        }
        return move;
    }
}