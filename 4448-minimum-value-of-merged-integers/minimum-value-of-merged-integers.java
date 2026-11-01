class Solution {
    public int minMergedInteger(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n-1; i+=2){
            String a = String.valueOf(nums[i]);
            String b = String.valueOf(nums[i+1]);
            String temp = a+b;
            int val = Integer.parseInt(temp);
            min = Math.min(min,val);
        }
        return min;
    }
}