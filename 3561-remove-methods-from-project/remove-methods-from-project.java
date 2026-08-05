class Solution {
    public void dfs(int node, List<List<Integer>> adj, int n , int[] visited ){
        visited[node] = 1;

        for(int i=0; i<adj.get(node).size(); i++){
            if(visited[adj.get(node).get(i)] == 0){
                dfs(adj.get(node).get(i),adj,n,visited);
            }
        }
    }
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> adj = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0; i<invocations.length; i++){
            int u = invocations[i][0];
            int v = invocations[i][1];
            adj.get(u).add(v);
        }

        int[] visited = new int[n];

        dfs(k,adj,n,visited);
        boolean flag = false;
        for(int i=0; i<invocations.length; i++){
            int u = invocations[i][0];
            int v = invocations[i][1];
            if(visited[u] == 0 && visited[v] != 0){
                flag = true;
            }
        }

        if(flag){
            for(int i=0; i<n; i++){
                ans.add(i);
            }
            return ans;
        }
        else{
            for(int i=0; i<n; i++){
                if(visited[i] ==0){
                    ans.add(i);
                }
            }
        }

        
        return ans;
    }
}