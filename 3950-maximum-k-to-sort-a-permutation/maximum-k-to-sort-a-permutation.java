class Solution {
    public int sortPermutation(int[] nums) {
        int and = -1;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] != i){
                and &= nums[i];
            }
        }
        return and == -1 ? 0 : and;
    }
}