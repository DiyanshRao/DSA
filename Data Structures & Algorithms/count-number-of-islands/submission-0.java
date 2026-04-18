class Solution {
    int [][] dir = new int [][] {
        {0,1}, {1,0}, {0,-1}, {-1,0}
    };

    public int numIslands(char[][] grid) {
        HashSet<String> visited = new HashSet<>();

        int count = 0;

        for(int i =0 ; i < grid.length; i++){
            for(int j =0; j < grid[0].length; j++){

                if(grid[i][j] == '0') continue;
                
                dfs(grid,visited,i,j);
                count++;
                
            }
        }
        return count;
    }

    private void dfs(char[][] grid, HashSet<String> visited, int row, int col){
        if(row < 0 || col < 0 || row > grid.length -1 || col > grid[0].length -1 || visited.contains(row+","+col) || grid[row][col] == '0'){
            return;
        }

        visited.add(row+","+col);
        grid[row][col] = '0';
        for(int[] d: dir){
            dfs(grid,visited,row + d[0], col + d[1]);
        }


    }

}
