class Solution {
    public int characterReplacement(String s, int k) {
        // Calculate the max freq in the current window check in create
        // 

        int maxFreq = 0;
        Map<Character, Integer> map = new HashMap<>();

        int start =0;
        int ans=0;

        for(int end = 0; end < s.length(); end++){
            
            char ch = s.charAt(end);

            map.put(ch, map.getOrDefault(ch,0) +1);

            maxFreq = Math.max(maxFreq, map.get(ch));


            while(end - start + 1 - maxFreq > k){
                char c = s.charAt(start);
                map.put(c, map.get(c) -1);
                start++;
            }

            ans = Math.max(ans, end - start + 1 );
        } 

        return ans;
    }
}
