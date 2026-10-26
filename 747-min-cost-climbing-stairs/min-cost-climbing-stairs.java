
class Solution {
    public int find(int[] cost, int idx, int[] dp) {
        int n = cost.length;

        if (idx >= n) {
            return 0;
        }

        if (dp[idx] != -1) {
            return dp[idx];
        }

        int one = cost[idx] + find(cost, idx + 1, dp);
        int two = cost[idx] + find(cost, idx + 2, dp);

        return dp[idx] = Math.min(one, two);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];

        Arrays.fill(dp, -1);

        return Math.min(find(cost, 0, dp), find(cost, 1, dp));
    }


}
