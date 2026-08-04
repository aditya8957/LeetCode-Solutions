class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        HashSet<Integer> st = new HashSet<>();

        int n = nums.length;
        for(int i = 0; i<n; i++){
            st.add(nums[i]);
        }
        for(int i=nums[0]; i<=nums[n-1]; i++){
            if(!st.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}