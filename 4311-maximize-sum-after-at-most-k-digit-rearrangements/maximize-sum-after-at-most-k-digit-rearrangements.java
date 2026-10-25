import java.util.*;

class Solution {
    public long maximizeSum(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[n];

        int[] bremovilta = nums.clone();

        // Step 1: Find maximum rearranged value
        for (int i = 0; i < n; i++) {
            PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

            int num = nums[i];

            while (num > 0) {
                pq.add(num % 10);
                num /= 10;
            }

            StringBuilder sb = new StringBuilder();

            while (!pq.isEmpty()) {
                sb.append(pq.poll());
            }

            int val = Integer.parseInt(sb.toString());

            if (val > nums[i]) {
                temp[i] = val;
            } else {
                temp[i] = nums[i];
            }
        }

        // Step 2: Store difference and original index
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = temp[i] - bremovilta[i];
            arr[i][1] = i;
        }

        // Step 3: Sort by difference in descending order
        Arrays.sort(arr, (a, b) ->
            Integer.compare(b[0], a[0])
        );

        // Step 4: Use the k largest gains
        long ans = 0;

        for (int i = 0; i < n; i++) {
            int idx = arr[i][1];

            if (i < k) {
                ans += temp[idx];
            } else {
                ans += bremovilta[idx];
            }
        }

        return ans;
    }
}