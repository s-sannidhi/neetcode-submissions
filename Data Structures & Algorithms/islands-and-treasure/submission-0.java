class Solution {
    static int inf = 2147483647;
    public void islandsAndTreasure(int[][] grid) {
        Queue<Integer[]> q = new LinkedList<>();
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] == 0){
                    Integer[] arr = {row, col};
                    q.add(arr);
                }
            }
        }
        while(!q.isEmpty()){
            Integer[] indices = q.poll();
            int row = indices[0];
            int col = indices[1];
            if(row < 0 || row > grid.length || col < 0 || col > grid[0].length){
                continue;
            }
            int curVal = grid[row][col];
            if((row+1) < grid.length && grid[row+1][col] > curVal + 1){
                grid[row+1][col] = 1 + curVal;
                Integer[] arr = {row+1, col};
                q.add(arr);
            }
            if((row-1) >= 0 && grid[row-1][col] > curVal + 1){
                grid[row-1][col] = 1 + curVal;
                Integer[] arr = {row-1 , col};
                q.add(arr);
            }
            if((col+1) < grid[0].length && grid[row][col+1] > curVal + 1){
                grid[row][col+1] = 1 + curVal;
                Integer[] arr = {row, col+1};
                q.add(arr);
            }
            if((col-1) >= 0 && grid[row][col-1] > curVal + 1){
                grid[row][col-1] = 1 + curVal;
                Integer[] arr = {row, col- 1};
                q.add(arr);
            }
                
        }

    }
}
    
