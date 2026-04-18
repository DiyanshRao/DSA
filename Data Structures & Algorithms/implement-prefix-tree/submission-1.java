class PrefixTree {

    class Trie{
        Trie [] trie = new Trie[26];
        boolean end = false;
    }

    Trie root;

    public PrefixTree() {
         this.root = new Trie();
    }

    public void insert(String word) {
        Trie curr = root;

        for(int i=0; i < word.length(); i++){
            char ch = word.charAt(i);
            int index = ch -'a';
            if(curr.trie[index] == null){
                curr.trie[index ] =  new Trie();
            }
            curr = curr.trie[index];
        }

        curr.end= true;
    }

    public boolean search(String word) {
            Trie curr = root;
            for(int i =0; i < word.length(); i++){
                char ch = word.charAt(i);
                int index = ch - 'a';
                if(curr.trie[index] == null) return false;

                curr = curr.trie[index];
            }

            return curr.end;
    }

    public boolean startsWith(String prefix) {
        Trie curr = root;
            for(int i =0; i < prefix.length(); i++){
                char ch = prefix.charAt(i);
                int index = ch - 'a';
                if(curr.trie[index] == null) return false;

                curr = curr.trie[index];
            }

            return true;
    }
}
