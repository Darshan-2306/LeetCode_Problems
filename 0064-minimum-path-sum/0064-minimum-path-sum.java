class Solution {
    // int min=Integer.MAX_VALUE;
    // public int helper(int[][] grid,int m,int n,int sum)
    // {
    //     if(m==grid.length-1 && n==grid[0].length-1)
    //     {
    //             sum+=grid[m][n];
    //             min=Math.min(min,sum);
    //              return min;
    //     }
    //     if(m < grid.length && n < grid[0].length) {
    //         sum += grid[m][n];
    //         if (n + 1 < grid[0].length) {
    //             helper(grid, m, n + 1, sum);
    //         }
    //         if (m + 1 < grid.length) {
    //             helper(grid, m + 1, n, sum);
    //         }
    // }
    //      return min;
    // }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=1;i<m;i++)
        {
            grid[i][0] += grid[i-1][0];
        }
        for(int j=1;j<n;j++){
            grid[0][j] += grid[0][j-1];
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                grid[i][j] += Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
    }

}
