class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>(); 
        int freshFruits = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] == 2){
                    int[] toAdd = {row, col};
                    q.add(toAdd);
                }
                else if(grid[row][col] == 1){
                    freshFruits++;
                }
            }
        }
        int time = 0;
        Set<int[]> toAdd = new HashSet<>();
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};        
        while(!q.isEmpty()){
            if(freshFruits == 0){
                return time;
            }
            while(!q.isEmpty()){
                int[] coords = q.poll();
                int row = coords[0];
                int col = coords[1];
                for(int[] direction: directions){
                    int rowNew = row + direction[0];
                    int colNew = col + direction[1];
                    int[] newPos = {rowNew, colNew};
                    toAdd.add(newPos);
                }
            }
            for(int[] coord : toAdd){
                int coordRow = coord[0];
                int coordCol = coord[1];
                if(coordRow < 0 || coordRow >= grid.length || coordCol < 0 || coordCol >= grid[0].length){
                    continue;
                }
                if(grid[coordRow][coordCol] == 2 || grid[coordRow][coordCol] == 0){
                    continue;
                }
                grid[coordRow][coordCol] = 2;
                q.add(coord);
                freshFruits--;

            }
            time++;
        }
        if(freshFruits == 0){
            return time;
        }
        return -1;
    }

   
}
