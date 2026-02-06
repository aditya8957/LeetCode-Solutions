class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i=0; 
        int j = 1;
        int c=0;
        while(j<n){

            if(nums[j] >(long)nums[i] * k){
                i++;
                c++;
            }
            j++;
        }
        return c;
    }
}