class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int presum = 0;
        int n = gain.length;
        for(int i=0; i<n; i++){
            presum += gain[i];
            max = Math.max(max, presum);
        }
        return max;
    }
}