class Solution {
    public int minOperations(int[] nums, int x) {
         int total = 0;

        for (int num : nums) {
            total += num;
        }

        int target = total - x;

        // We need to remove the whole array
        if (target == 0) {
            return nums.length;
        }

        int left = 0;
        int sum = 0;
        int maxLen = -1;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > target && left <= right) {
                sum -= nums[left];
                left++;
            }

            if (sum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        if (maxLen == -1) {
            return -1;
        }

        return nums.length - maxLen;
    }
}