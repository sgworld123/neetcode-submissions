class Solution {
    int[] dir1 = {-1 , 1 , 0 , 0};
    int[] dir2 = { 0 , 0,  1, - 1};
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int n = grid.length;
        int m = grid[0].length;    
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                if(grid[i][j] == 2)
                {
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j] == 1)
                {
                    fresh++;
                }
            }
        }
        if(fresh == 0)
        {
            return 0;
        }
        int count = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            while(size-- > 0)
            {
                var a = q.poll();
                int i = a[0];
                int j = a[1];
                for(int r = 0 ; r < 4 ; r++)
                {
                    int newi = i + dir1[r];
                    int newj = j + dir2[r];

                    if(newi >= 0 && newi < n && newj >= 0 && newj < m
                    && grid[newi][newj] == 1)
                    {
                        grid[newi][newj] = 2;
                        q.add(new int[]{newi,newj});
                        fresh--;
                    }
                }
            }
            count++;
        }
        if(fresh > 0)
        {
            return -1;
        }    
        return count - 1;
    }
}
