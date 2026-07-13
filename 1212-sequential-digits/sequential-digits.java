class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=8; i++){
            q.add(i);
        }

        while(!q.isEmpty()){
            int temp = q.poll();
            if(temp>=low && temp<=high){
                ans.add(temp);
            }
            int val = temp%10;
            if(val+1 <= 9){
                q.add(temp*10+(val+1));
            }
        }
        return ans;
    }
}