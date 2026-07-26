class Solution {
    public int largestInteger(int n, int s) {
        int max = -1;
        if(s == 0) return 0;
        for(int i=1; i<=99999; i++){
            int num = i;
            int sum = 0;
            int count = 0;
            while(num>0){
                sum += num%10;
                count++;
                num = num/10;
            }
            if(sum == s && count == n){
                max = Math.max(max,i);
            }
        }
        return max;
    }
}