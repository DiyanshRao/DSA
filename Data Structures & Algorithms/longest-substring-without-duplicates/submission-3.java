class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start =0, end =0, sol = 0;
        Map<Character,Integer> map = new HashMap<>();

        while(end < s.length()){
            char key = s.charAt(end);
            if(map.containsKey(key)){
                
                if(start <= map.get(key)){
                    start = map.get(key) +1;
                }
            }

            sol = Math.max(sol, end -start +1);
            map.put(key,end);

            end++;
        }
        
        return sol;
    }    
}
