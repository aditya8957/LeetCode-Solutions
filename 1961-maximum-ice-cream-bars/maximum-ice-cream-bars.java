class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        int n = costs.length;
        for(int i=0; i<n; i++){
            if(coins>=costs[i]){
                coins -= costs[i];
                count++;
            }
        }
        return count;
    }
}