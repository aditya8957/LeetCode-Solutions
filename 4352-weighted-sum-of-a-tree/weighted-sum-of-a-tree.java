class Solution {
    public void dfs(int node, int[] dist, int[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;

        for(int i=0; i<adj.get(node).size(); i++){
            int neig = adj.get(node).get(i);
            if(vis[neig] == 0){
                dist[neig] = dist[node]+1;
                dfs(neig,dist,vis,adj);
            }
        }
    }

    public long weightedSum(int[] parent, int[] nums) {
        int n = parent.length;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 1; i < n; i++) {
            adj.get(parent[i]).add(i);
        }

        int[] dist = new int[n];
        dist[0] = 1;
        int[] vis = new int[n];
    
        dfs(0,dist,vis,adj);
        int h = 0;
        for(int i=0; i<n; i++){
            h = Math.max(h,dist[i]);
        }

        long ans = 0;

        for(int i=0; i<n; i++){
            System.out.print(dist[i]+" ");
            long val = (long) nums[i] * (h - dist[i] + 1);
            ans += val;

        }

        return ans;
    }
}