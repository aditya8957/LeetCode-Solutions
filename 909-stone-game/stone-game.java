class Solution {
     public int find(int i, int j, int[] nums, int[][] dp){
        if(i>j) return 0;

        if(i == j) return nums[i];

        if(dp[i][j] != -1) return dp[i][j]; 

        int take_i = nums[i]-find(i+1,j,nums,dp);
        int take_j = nums[j]-find(i,j-1,nums,dp);

        return dp[i][j] = Math.max(take_i, take_j);
    }
    public boolean stoneGame(int[] piles) {
        int n= piles.length;
        int[][] dp = new int[n][n];

        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        return find(0,n-1,piles, dp)>=0;
    }
}