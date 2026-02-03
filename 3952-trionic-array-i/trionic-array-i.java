class Solution {
    public boolean isTrionic(int[] nums) {
        
        int n = nums.length;
        if(nums[1] <= nums[0]) return false;
        if(nums[n-1] <= nums[n-2]) return false;

        int idx=1;

        while(idx<n && (nums[idx] > nums[idx-1])) idx++;
        if(idx == n) return false;
        while(idx<n && (nums[idx] < nums[idx-1])) idx++;
        if(idx == n) return false;
        while(idx<n && (nums[idx] > nums[idx-1])) idx++;
       
        return idx == n;
 
    }
}











