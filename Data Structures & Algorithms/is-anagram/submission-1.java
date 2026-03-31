class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i =0; i < s.length(); i++){
            Integer val =  map.getOrDefault(s.charAt(i),0);
            map.put(s.charAt(i), val+1);
        }

        for(int i =0; i < t.length(); i++){
            Character key = t.charAt(i);
            if(!map.containsKey(key)){
                return false;
            }

            Integer val = map.get(key) -1;
            
            if(val < 0){
                return false;
            }else if(val == 0){
                map.remove(key);
            }else{
                map.put(key,val);
            }
        }


        return map.isEmpty();
    }
}