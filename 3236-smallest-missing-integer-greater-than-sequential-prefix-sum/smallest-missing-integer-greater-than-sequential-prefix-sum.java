class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int n = nums.length;
        int ans = 0;
        int sum = nums[0];
        for (int x : nums) {
            st.add(x);
        }

        int i = 1;

        while (i < n && nums[i] - 1 == nums[i - 1]) {
            sum += nums[i];
            i++;
        }

        while (st.contains(sum)) {
            sum++;
        }
        ans = Math.max(ans, sum);

        return ans;
    }
}