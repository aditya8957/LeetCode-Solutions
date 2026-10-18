class Solution {
    public int minDeletions(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=1; i<n; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
        }
        return count;
    }
}