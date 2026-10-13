class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        int j = n-1;
        
        for(int i=0; i<n; i++){
            if(nums[i] < 0){
                nums[i] = nums[i]*-1;
            }
        }
        Arrays.sort(nums);
        int mid = (int) Math.ceil(Math.floor(n)/2);
        System.out.println(mid);
        int k = nums.length-mid;
        long sum1 = 0;
        long sum2 = 0;
        while(mid>0){
            sum1 += Math.pow(nums[j],2);
            j--;
            mid--;
        }
        System.out.println(sum1);

        int i = 0;

        while(k>0){
            sum2 += Math.pow(nums[i],2);
            i++;
            k--;
        }

        return sum1-sum2;
    }
}