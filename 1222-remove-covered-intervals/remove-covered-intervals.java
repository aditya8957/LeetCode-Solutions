class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if(a[0] != b[0])
                return a[0]-b[0];
            else
                return b[1]-a[1];
        });
        int count = 0;
        int n = intervals.length;
        for(int i=1; i<n; i++){
            if(intervals[i][0]>=intervals[i-1][0] && intervals[i][1]<=intervals[i-1][1]){
                intervals[i][0] = intervals[i-1][0];
                intervals[i][1] = intervals[i-1][1];
                count++;
            }
        }
        return n-count;
    }
}