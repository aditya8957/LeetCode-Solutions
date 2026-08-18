class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        boolean flag1 = true;
        boolean flag2 = true;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }
        if(n == 1) return nums[0];

        // if(k == 1){
        //     if(nums[0] == nums[n-1]) return -1;
        // }
        if(k == 1){
            int max = -1;
            for(int i=0; i<n; i++){
                if(mp.get(nums[i]) == 1){
                    max = Math.max(max,nums[i]);
                }

            }
            return max;
        }
        if(k == n){
            int max = 0;
            for(int i=0; i<n; i++){
                max = Math.max(max,nums[i]);
            }
            return max;
        }

        for(int i=1; i<n; i++){
            if(nums[0] == nums[i]){
                flag1 = false;
            }
        }

        for(int i = n-1; i>0; i--){
            if(nums[n-1] == nums[i-1]){
                flag2 = false;
            }
        }
        if(!flag1 && !flag2) return -1;
        if(flag1 && flag2) return Math.max(nums[0],nums[n-1]);
        if(!flag1) return nums[n-1];
        return nums[0];
    }
}