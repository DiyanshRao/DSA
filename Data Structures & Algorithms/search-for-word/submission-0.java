class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i =0; i < board.length; i++){
            for(int j =0; j < board[0].length; j++){
                if(word.charAt(0) != board[i][j]){
                    continue;
                }
                if(dfs(board,word,i,j,0)){
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word, int row, int col, int index){

        if(word.length() == index ){
            return true;
        }

        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || word.charAt(index) != board[row][col] ){
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '#';

        boolean bool = dfs(board,word,row ,col + 1, index +1) || 
        dfs(board,word,row ,col - 1, index +1) || 
        dfs(board,word,row -1 ,col,index +1) ||
        dfs(board,word,row + 1,col,index +1);

        board[row][col] = temp;

        return bool;

        

    }
}
