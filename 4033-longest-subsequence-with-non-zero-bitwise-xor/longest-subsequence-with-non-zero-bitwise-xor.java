class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xor = 0;
        int c = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == 0) c++;
            xor ^= nums[i];
        }
        if(c == n) return 0;
        if(xor == 0) return nums.length-1;
        return nums.length;
    }
}