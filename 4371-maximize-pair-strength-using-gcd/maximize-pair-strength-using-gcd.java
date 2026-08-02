class Solution {
    public long gcd(int x, int y){
        if(y == 0) return x;

        return gcd(y,x%y);
    }
    public long maxPairStrength(int[] nums) {
        int n = nums.length;
        long max = Long.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                long g = gcd(nums[i],nums[j]);
                long mul = (long)nums[i]*nums[j];
                long ans = (mul/(long)(Math.pow(g,2)));
                max = Math.max(max, ans);
            }
        }
        return max;
    }
}