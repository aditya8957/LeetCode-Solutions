class Solution {
    public int countSetBits(int n){
        int count = 0;
        while(n>0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public int calculateScore(int a, int b) {
        int x = countSetBits(a);
        int y = countSetBits(b);

        if(x>=y) return x*y;
        return y/x;

    }
}