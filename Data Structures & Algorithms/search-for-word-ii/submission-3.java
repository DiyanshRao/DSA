class Solution {

    class Trie{ 
        Trie [] branch = new Trie[26];
        String word = null;
    }

    int [][] dir = new int[][] {
        {0,1},{1,0},{0,-1},{-1,0}
    };

    List<String> res = new ArrayList<>();

    public List<String> findWords(char[][] board, String[] words) {
        Trie root = new Trie();
        createTrie(words,root);

        for(int i =0; i< board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                dfs(board,root,i,j);
            }
        }

        return res;
        
    }

    private void dfs(char[][] board, Trie root, int row, int col){

        if(row < 0 || col < 0 || row > board.length -1 || col > board[0].length -1 || board[row][col] == '#'){
            return;
        }

        char ch = board[row][col];

        if(root.branch[ch - 'a'] == null) return;
        root = root.branch[ch - 'a'];

        if(root.word != null){
            res.add(root.word);
            root.word = null;
        }

        board[row][col] = '#';

        for(int [] d : dir){
            dfs(board, root, row + d[0], col + d[1]);
        }
        board[row][col] = ch;
    }

    private void createTrie(String[] words, Trie root){
        for(String str : words){
            Trie curr = root;

            for(int i =0; i < str.length();i++){
                int index = str.charAt(i) - 'a';

                if(curr.branch[index] == null) {
                    curr.branch[index] = new Trie();
                }
                curr = curr.branch[index];
            }
            curr.word = str;
        }
    }
}
