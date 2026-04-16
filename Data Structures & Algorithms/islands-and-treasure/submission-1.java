class Solution {
    int[] dist1 = {-1, 1 ,0 , 0};
    int[] dist2 = {0 , 0, 1 , -1};
    public void islandsAndTreasure(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]>  q = new LinkedList<>();
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                if(grid[i][j] == 0)
                {
                    q.add(new int[]{0,i,j});
                }
            }
        }
        while(!q.isEmpty())
        {
            var a = q.poll();
            int i = a[1];
            int j = a[2];
            int dist = a[0];
            for(int p = 0 ; p < 4 ; p++)
            {
                int newi = i + dist1[p];
                int newj = j + dist2[p];

                if(newi >= 0 && newi < n && newj >= 0 && newj < m
                 && grid[newi][newj] == 2147483647)
                {
                    grid[newi][newj] = dist + 1;
                    q.add(new int[]{dist + 1 , newi , newj});
                }
            }
        }
    }
}
