class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int idx1 = -1;
        int idx2 = -1;
        for(int i=0; i<n; i++){
            if(nums[i]>max){
                max = nums[i];
                idx1 = i;
            }
            if(nums[i]<min){
                min = nums[i];
                idx2 = i;
            }
        }
        int ans1;
        int ans2;
        int ans;
        System.out.print(idx1+" "+idx2);
        if(idx1<idx2){
            ans1 = idx2+1;
            ans2 = (n-idx1);
            ans = idx1+1 + (n-idx2);
        }
        else{
            ans1 = idx1+1;
            ans2 = (n-idx2);
            ans = (n-idx1)+(idx2+1);
        }
        return Math.min(ans,Math.min(ans1,ans2));
    }
}