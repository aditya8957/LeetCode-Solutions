class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = nums[0];
        right[n-1] = nums[n-1];

        for(int i=1; i<n; i++){
            left[i] = Math.max(nums[i],left[i-1]);
        }
        for(int i=n-2; i>=0; i--){
            right[i] = Math.max(nums[i],right[i+1]);
        }
        long ans = 0;
        for(int j=1; j<n-1; j++){
            ans = (long)Math.max(ans,(long)(left[j-1]-nums[j])*right[j+1]);
        }
        return ans;
    }
}