class Solution {
    class Pair {
        int first;
        int sec;

        Pair(int first, int sec) {
            this.first = first;
            this.sec = sec;
        }
    }
    public long bfs(int[][] grid, int row, int col){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        long sum = 0;
        sum += grid[row][col];
        grid[row][col] = 0;

        while(!q.isEmpty()){
            int r = q.peek().first;
            int c= q.peek().sec;
            q.remove();

            for(int drow=-1; drow<=1; drow++){
                for(int dcol=-1; dcol<=1; dcol++){

                    if(Math.abs(drow) == Math.abs(dcol)) continue;

                    int nrow = r+drow;
                    int ncol = c+dcol;

                    if(nrow>=0 && ncol>=0 && nrow<grid.length && ncol<grid[0].length &&
                    grid[nrow][ncol] != 0){

                        q.add(new Pair(nrow, ncol));
                        sum += grid[nrow][ncol];
                        grid[nrow][ncol] = 0;
                        
                    }
                    
                }
            }
        }
        return sum;
    }


    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        int count = 0;
        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(grid[i][j] != 0){
                    long sum = bfs(grid,i,j);
                    if(sum%k == 0) count++;
                }
            }
        }
        return count;
    }
}