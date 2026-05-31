class Solution {
    public int lengthOfLongestSubstring(String s) {
        //create A map store the index of char 
        //use start and end pointer to detrimine the lenght
        // update start pointer if duplicate found 


        Map<Character,Integer> map = new HashMap<>();

        int start =0;
        int end=0;

        int ans = 0;

        while(end  < s.length()){
            char ch = s.charAt(end);
            //duplicate
            if(map.containsKey(ch)){
                
                if(map.get(ch) >= start){
                    start = map.get(ch) +1;
                }
            }
            map.put(ch,end);
            ans = Math.max(ans, end -start +1);
            end++;

        }

        return ans;
    }
}
