class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[] temp = new int[n*m];
        int[][] mat = new int[n][m];
        int z = 0;
        for(int j=0; j<n; j++){
            for(int c=0; c<m; c++){
                temp[z] = grid[j][c];
                z++;
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        int[] arr = new int[n*m];
        
        for(int i=0; i<temp.length; i++){
            arr[(i+k)%temp.length] = temp[i];
        }
        
        int idx = 0;

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < m; j++) {
                row.add(arr[idx++]);
            }

            list.add(row);
        }
        return list;
    }
}