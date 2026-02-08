class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int c = 0;
        for(int i=0; i<n-1; i++){
            int sum = 0;
            for(int j=i+1; j<n; j++){
                sum += nums[j];
            }
            if(nums[i]>sum/(n-i-1)) c++;
        }
        return c;
    }
}