class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] indegree = new int[n + 1];
        int[] outdegree = new int[n + 1];

        for(var i : trust)
        {
            int one = i[0];
            int two = i[1];
            indegree[two]++;
            outdegree[one]++;
        }
        for(int i = 1 ; i <= n ; i++)
        {
            if(indegree[i] == n - 1 && outdegree[i] == 0)
            {
                return i;
            }
        }
        return -1;
    }
}