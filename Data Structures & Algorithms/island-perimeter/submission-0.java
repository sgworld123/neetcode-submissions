class Solution {
    int[] dir1 = {1 , -1 , 0 , 0};
    int[] dir2 = {0 , 0 , 1 , -1};
    public int islandPerimeter(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0 ; i < grid.length ; i++)
        {
            for(int j = 0 ; j < grid[0].length ; j++)
            {
                if(grid[i][j] == 1)
                {
                    q.add(new int[]{i,j});
                    break;
                }
            }
            if(!q.isEmpty())
            {
                break;
            }
        }
        int count = 0;
        while(!q.isEmpty())
        {
            var a = q.poll();
            int i = a[0];
            int j = a[1];

            grid[i][j] = -1;

            for(int w = 0 ; w < 4 ; w++)
            {
                int newi = i + dir1[w];
                int newj = j + dir2[w];
                if(newi >= 0 && newi < n && newj >= 0 && newj < m)
                {
                    if(grid[newi][newj] == 1)
                    {
                        q.add(new int[]{newi,newj});
                        grid[newi][newj] = -1;
                    }
                    else if(grid[newi][newj] == 0)
                    {
                        count++;
                    }
                }
                else 
                {
                    count++;
                }
            }  
        }
        return count;
    }
}