class WordDictionary {

    class Trie{
        Trie [] branch = new Trie[26];
        boolean end = false;
    }

    Trie root;

    public WordDictionary() {
       this.root = new Trie(); 
    }

    public void addWord(String word) {
        Trie curr = root;

        for(int i =0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';

            if(curr.branch[index] == null){
                curr.branch[index] = new Trie();
            }

            curr = curr.branch[index];
            
        }
        curr.end = true;
    }

    public boolean search(String word) {
        Trie curr = root;
        return dfs(curr,0,word);
    }

    private boolean dfs(Trie curr, int index, String word){
        
        while(index < word.length()){
            char ch = word.charAt(index);
            if(ch == '.'){
                for(int i =0; i < 26; i++){
                    if(curr.branch[i] == null) continue;
                    if (dfs(curr.branch[i], index + 1, word)) return true;
                    
                }
                return false;
            }else{
                if( curr.branch[ch - 'a'] == null) return false;
                curr = curr.branch[ch - 'a'];
            }
            
        index++;
        }

        return curr.end;
    }
}
