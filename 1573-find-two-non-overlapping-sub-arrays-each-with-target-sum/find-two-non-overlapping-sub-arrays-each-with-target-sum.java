class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] minIdx = new int[n];
        Arrays.fill(minIdx, Integer.MAX_VALUE);

        int i = 0;
        int j = 0;
        int sum = 0;
        int len  = 0;
        int bestMin = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;

        while(j<n){
            sum += arr[j];

            while(sum > target){
                sum -= arr[i];
                i++;
            }

            if(sum == target){
                len = j-i+1;
                if(i>0 && minIdx[i-1] != Integer.MAX_VALUE){
                    result = Math.min(result, len + minIdx[i-1]);
                }
                bestMin = Math.min(bestMin, len);
            }
            minIdx[j] = bestMin;
            j++;
        }
        
        return result == Integer.MAX_VALUE?-1:result;
    }
}