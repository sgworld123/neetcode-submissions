class Solution {
    int sum = 0;
    public void dfs(int[][] grid,int i , int j)
    {
        if(i >= 0 && i < grid.length && j >= 0 && j < grid[0].length
        && grid[i][j] == 1)
        {
            grid[i][j] = 0;
            sum++;
            dfs(grid,i + 1 , j);
            dfs(grid,i - 1 , j);
            dfs(grid,i, j + 1);
            dfs(grid,i, j - 1);
        }
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                dfs(grid,i , j);
                max = Math.max(max,sum);
                sum = 0;
            }
        }
        return max ;
    }
}
