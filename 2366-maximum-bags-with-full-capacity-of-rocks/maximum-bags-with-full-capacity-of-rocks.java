class Pair{
    int idx;
    int diff;

    Pair(int idx, int diff){
        this.idx = idx;
        this.diff = diff;
    }
}
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = rocks.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            return a.diff - b.diff;
        });

        for(int i=0; i<n; i++){
            pq.add(new Pair(i,capacity[i]-rocks[i]));
        }
        int count = 0;
        while(!pq.isEmpty() && additionalRocks>0){
            Pair p = pq.poll();
            int d = p.diff;

            if(d>0 && d<=additionalRocks){
                count++;
                additionalRocks -= d;
            }
            else if(d == 0) count++;
        }
        return count;
    }
} 
