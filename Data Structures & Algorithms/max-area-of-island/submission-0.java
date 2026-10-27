class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] == 1){
                    max = Math.max(max, dfs(row, col, grid));
                }
            }
        }
        return max;
    }
    private int dfs(int row, int col, int[][] grid){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length){
            return 0;
        }
        if(grid[row][col] == 0){
            return 0;
        }
        grid[row][col] = 0;
        return 1 + dfs(row+1, col, grid) + dfs(row-1, col, grid) + dfs(row, col+1, grid) + dfs(row, col-1, grid);
    }
}
