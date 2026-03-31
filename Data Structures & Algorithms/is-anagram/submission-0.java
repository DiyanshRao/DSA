class Solution {
    public boolean isAnagram(String s, String t) {
        /* Try to store the count of the occurace of the charters in string 1*/

        HashMap<Character,Integer> store = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            store.put(ch, store.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch =  t.charAt(i);
            if(store.containsKey(ch)){
                store.put(ch,(store.get(ch) -1));
                if(store.get(ch) == 0 ){
                    store.remove(ch);
                }
            }else{
                return false;
            }
        }
        return store.isEmpty();

    }
}
