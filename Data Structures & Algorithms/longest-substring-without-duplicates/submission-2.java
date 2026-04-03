class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int sol =0;

        int start=0,end=0;

        while(end < s.length()){
            Character ch = s.charAt(end);

            if(map.containsKey(ch)){
                Integer key = map.get(ch);
                if(start <= key){
                    start = key+1;
                }
            }

            map.put(ch,end);

            sol = Math.max(sol,(end - start +1));
            end++;



        }

        return sol;
        
    }
}
