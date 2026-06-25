class Solution {
    public int count(int i,int[] dp){
        if(i <= 2) return i;
        if(dp[i] != -1){
            return dp[i]; //if already filled
        }

        return dp[i] = count(i-1,dp) + count(i-2,dp);

    }
    public int climbStairs(int n) {
       int[] dp = new int[n+2];
       Arrays.fill(dp,-1);
       return count(n,dp);
    }
}