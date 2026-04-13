
class TrieNode {
    TrieNode [] child = new TrieNode[26];
    boolean end = false;
}
class PrefixTree {
    TrieNode root;
    public PrefixTree() {
          this.root = new TrieNode();
    }

    public void insert(String word) {

        TrieNode curr = root;

        for(char ch : word.toCharArray()){

            int index = ch - 'a';

            if(curr.child[index] == null){
                TrieNode node = new TrieNode();
                curr.child[index] = node;
            }

            curr = curr.child[index];
        }

        curr.end = true;

    }

    public boolean search(String word) {
        TrieNode curr = root;

        for(char ch : word.toCharArray()){
            int index = ch - 'a';

            if(curr.child[index] == null){
                return false;
            }

            curr = curr.child[index];
        
        }

        return curr.end;
    }

    public boolean startsWith(String prefix) {

        TrieNode curr = root;

        for(char ch : prefix.toCharArray()){
            int index = ch - 'a';

            if(curr.child[index] == null){
                return false;
            }

            curr = curr.child[index];
        
        }

        return true;

    }
}
