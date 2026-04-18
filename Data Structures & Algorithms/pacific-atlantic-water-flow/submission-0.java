class Solution {
    int[][] dir  = new int [][] {
            {0,1}, {1,0}, {0,-1},{-1,0}
        };
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        HashSet<String> pacific = new HashSet<>();
        HashSet<String> atlantic = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        

        int row = heights.length;
        int col = heights[0].length;
        for(int i =0; i < row; i++){
            for( int j =0; j < col; j++){
                if( i== 0 || j ==0){
                    //traverse pacific
                    pacific.add(i + "," + j);
                    dfs(heights, i, j, pacific);
                }

                if(i == row -1 || j == col -1 ){
                    //traverse atlantic
                    atlantic.add(i + "," + j);
                    dfs(heights, i, j, atlantic);
                }
            }
        }

        for(String key : atlantic){
            if(pacific.contains(key)){
                String[] arr = key.split(",");
                res.add(List.of(
                    Integer.parseInt(arr[0]),Integer.parseInt(arr[1])
                    ));
            }
        }

        return res;
    }


    private void dfs(int[][] heights, int row, int col, HashSet<String> visited){
        

        for(int[] d : dir){
            int newRow = row + d[0];
            int newCol = col + d[1];
            if( newRow < 0 || newCol < 0 
                || newRow > heights.length -1 
                || newCol > heights[0].length -1 
                || visited.contains(newRow+","+newCol) 
                || heights[newRow][newCol] < heights[row][col] ){
            continue;
            }
            visited.add(newRow+ ","+newCol);
            dfs(heights,newRow,newCol,visited); 
        }
    }
}
