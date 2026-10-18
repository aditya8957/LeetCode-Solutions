class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int j = 0;
        int i = 0;
        while(i>=0 && i<n && j>=0 && j<m){
                if(grid[i][j] == 'L'){
                    if(i>=0 && i<n && j-1 >= 0 && j-1 < m && grid[i][j-1] != '0'){
                        grid[i][j] = '0';
                        j = j-1;
                    }
                    else{
                        break;
                    }
                }
                else if(grid[i][j] == 'R'){
                    if(i>=0 && i<n && j+1>=0 && j+1 < m && grid[i][j+1] != '0'){
                        grid[i][j] = '0';
                        j = j+1;
                    }
                    else{
                        break;
                    }
                }
                else if(grid[i][j] == 'U'){
                    if(i-1>=0 && i-1<n && j>=0 && j < m && grid[i-1][j] != '0'){
                        grid[i][j] = '0';
                        i = i-1;

                    }
                    else{
                        break;
                    }
                }
                else if(grid[i][j] == 'D'){
                    if(i+1>=0 && i+1<n && j>=0 && j < m && grid[i+1][j] != '0' ){
                        grid[i][j] = '0';
                        i = i+1;

                    }
                    else{
                        break;
                    }
                }
                else{ 
                    return new int[]{i,j};
                }
  
        }
        return new int[]{i,j};

    }
}