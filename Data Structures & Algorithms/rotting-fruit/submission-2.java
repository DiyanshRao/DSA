class Solution {
    int [][] directions = new int [][] {
        {0,1},{1,0},{0,-1},{-1,0}
    };
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int count = -1;
        int fresh =0;
        int r = grid.length;
        int c = grid[0].length;
        for(int i =0; i < r; i++){
            for(int j =0; j < c; j++){
                if(grid[i][j] == 2){
                    queue.offer(new int [] {i,j});
                }else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        if(fresh == 0) return fresh;

        while(!queue.isEmpty()){
            int size = queue.size();

            while(size > 0){
                int [] arr = queue.poll();
                for(int [] dir : directions){
                    
                    int row = arr[0] + dir[0];
                    int col = arr[1] + dir[1];

                    if(row < 0 || col < 0 || row >= r|| col >= c || grid[row][col] != 1 ){
                        continue;
                    }
                    fresh--;
                    grid[row][col] = 2;
                    queue.offer(new int [] {row,col});
                    
                }
                size--;
                
            }
            count++;
            
        }
        
        return fresh == 0 ? count : -1;


    }
}
