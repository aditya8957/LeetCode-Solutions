class Solution {

    public long countSubarrays(int[] nums, long k) {
        Deque<Integer> maxdq = new ArrayDeque<>();
        Deque<Integer> mindq = new ArrayDeque<>();
        int n = nums.length;
        int l = 0,r=0;
        long ans = 0;

        while(r<n){

            while(!maxdq.isEmpty() && nums[maxdq.peekLast()] <= nums[r] ){
                maxdq.pollLast();
            }

            while(!mindq.isEmpty() && nums[mindq.peekLast()] > nums[r] ){
                mindq.pollLast();
            }

            maxdq.add(r);
            mindq.add(r);

            while(!maxdq.isEmpty() && !mindq.isEmpty() && l<n && (long)(nums[maxdq.peekFirst()]-nums[mindq.peekFirst()])*(r-l+1)  > k){
                if(maxdq.peekFirst() <= l){
                    maxdq.pollFirst();
                }
                if(mindq.peekFirst() <= l){
                    mindq.pollFirst();
                }

                l++;
            }

            ans += r-l+1;
            r++;
        }
        return ans;
    }
}