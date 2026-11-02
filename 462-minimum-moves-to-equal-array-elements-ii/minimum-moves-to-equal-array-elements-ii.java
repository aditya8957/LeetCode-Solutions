class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int mid = nums[n/2];
        int ans = 0;
        for(int i=0; i<n; i++){
            ans += Math.abs(nums[i]-mid);
        }
        return ans;
    }
}