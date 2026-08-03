class Solution {
    public int find(int[] stoneValue, int idx,int n, int[] dp){
        if(idx >= n) return 0;

        if(dp[idx] != -1) return dp[idx];

        int oneTake = stoneValue[idx]-find(stoneValue,idx+1,n,dp);

        int twoTake = Integer.MIN_VALUE;
        if(idx<n-1)
        twoTake = stoneValue[idx]+stoneValue[idx+1]-find(stoneValue,idx+2,n,dp);

        int threeTake = Integer.MIN_VALUE;
        if(idx<n-2)
        threeTake = stoneValue[idx]+stoneValue[idx+1]+stoneValue[idx+2]-find(stoneValue,idx+3,n,dp);

        return dp[idx] = Math.max(oneTake,Math.max(twoTake,threeTake));
    }
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        if(find(stoneValue,0,n,dp)>0) return "Alice";
        if(find(stoneValue,0,n,dp)>=0) return "Tie";
        return "Bob";
    }
}