class Solution {
    public int maxDistance(String moves) {
        int x = 0;
        int y = 0;
        int count = 0;

        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                y++;
            }
            else if(moves.charAt(i) == 'D'){
                y--;
            }
            else if(moves.charAt(i) == 'L'){
                x--;
            }
            else if(moves.charAt(i) == 'R'){
                x++;
            }
            else{
                count++;
            }
        }
        int ans = Math.abs(0-x)+Math.abs(0-y);
        return ans+count;
    }
}