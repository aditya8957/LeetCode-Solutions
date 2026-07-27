class Solution {
    public int maxProduct(int[] nums) {
        int n  = nums.length;
        Arrays.sort(nums);
        int i =n-1, j=n-2;
        return (nums[i]-1)*(nums[j]-1);
    }
}