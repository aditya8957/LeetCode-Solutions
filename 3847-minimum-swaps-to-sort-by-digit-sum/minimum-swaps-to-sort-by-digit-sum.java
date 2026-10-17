class Solution {

    class Pair {
        int num;
        int idx;

        Pair(int num, int idx) {
            this.num = num;
            this.idx = idx;
        }
    }

    private int getDigitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;
        Pair[] arr = new Pair[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(nums[i], i);
        }

        Arrays.sort(arr, (a, b) -> {
            int sum1 = getDigitSum(a.num);
            int sum2 = getDigitSum(b.num);

            if (sum1 != sum2) {
                return sum1 - sum2;
            }

            return a.num - b.num;
        });

        Map<Integer, Integer> valToIdx = new HashMap<>();

        for (int i = 0; i < n; i++) {
            valToIdx.put(nums[i], i);
        }

        int swaps = 0;

        for (int i = 0; i < n; i++) {
            int expectedVal = arr[i].num;
            int currVal = nums[i];

            if (expectedVal == currVal) {
                continue;
            }

            int idx = valToIdx.get(expectedVal);

            nums[i] = expectedVal;
            nums[idx] = currVal;

            valToIdx.put(expectedVal, i);
            valToIdx.put(currVal, idx);

            swaps++;
        }

        return swaps;
    }
}