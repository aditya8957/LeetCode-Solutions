class Solution {
    public int countGoodRotations(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int x:nums){
            list.add(x);
        }
        long fsum = 0;
        long lsum = 0;
        int i=0;
        int j = n/2;
        int count = 0;
        while(j<n){
            fsum += nums[i];
            lsum += nums[j];
            i++;
            j++;
        }
        i = 0;
        j = n/2;
        System.out.println(fsum +" "+ lsum);

        while(i<n){
            if(fsum>lsum) count++;

            fsum = fsum - nums[i] + nums[(i+j)%n];
            lsum = lsum + nums[i] - nums[(i+j)%n];

            i++;
        }
        return count;
    }
}