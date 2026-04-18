class Solution {

    List<String> res = new ArrayList<>();
    public List<String> findWords(char[][] board, String[] words) {
        int [][] dir = new int [][] {
            {0,1}, {1,0}, {0,-1}, {-1,0}
        };

    

        for(String str : words){
            boolean found = false;
            for(int i =0; i < board.length; i++){
                for(int j =0; j < board[0].length && !found; j++){
                   
                    if(dfs(board, str, 0, i, j, dir)){
                        res.add(str);
                        found = true;
                    }
                    
                }
            }

        }

        return res;
    }

    private boolean dfs(char[][] board, String str, int index, int row, int col, int [][] dir){

        if(row < 0 || col < 0 || row > board.length -1 || col > board[0].length -1 ||str.charAt(index) != board[row][col] ){
            return false;
        }

        if(index == str.length() -1){
            return true;
        } 

        char temp = board[row][col];
        board[row][col] = '#';
        boolean bool = dfs(board,str,index +1, row + dir[0][0], col + dir[0][1], dir) 
            || dfs(board,str,index +1, row + dir[1][0], col + dir[1][1], dir)
            || dfs(board,str,index +1, row + dir[2][0], col + dir[2][1], dir)
            || dfs(board,str,index +1, row + dir[3][0], col + dir[3][1], dir);

        board[row][col] = temp;

        return bool;    
    }
}
