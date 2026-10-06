class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        for(char ch : t.toCharArray()){

            if(!map.containsKey(ch)) return false;
            int val = map.get(ch) -1;
            map.put(ch, val);
            if(val == 0 ){
                map.remove(ch);
            } 
           
        }

        return true;

        
    }
}
