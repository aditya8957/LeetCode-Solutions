class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int n = arrivalTime.length;
        Arrays.sort(lights);
        int max = lights[lights.length-1];
        int ans = 0;
        for(int i=0; i<n; i++){
            int r = arrivalTime[i]%period;
            if(r>=max){
                ans = Math.max(ans,period-r);
            }
        }
        return ans;
    }
}