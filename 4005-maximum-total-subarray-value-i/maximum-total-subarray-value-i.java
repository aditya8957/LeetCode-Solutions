class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long ans = 0;
        int min = nums[0];
        int max = nums[0];
       
        for(int i=0; i<nums.length; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }  
        long sub = max-min;

        while(k>0){
            ans += sub;
            k--;
        }
        return ans;
    }
}