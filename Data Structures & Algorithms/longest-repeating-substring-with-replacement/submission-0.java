class Solution {
    public int characterReplacement(String s, int k) {
        //count the characters and frequences 
        // get the max freq so far check if we it falls into our condition
        // move left pointer till it beomes valid again
        // update the result

        int maxFreq = 0;
        int left =0;
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0) +1);
            maxFreq = Math.max(maxFreq, map.get(ch));


            while( right - left + 1 - maxFreq > k){
                char cl = s.charAt(left);
                map.put(cl,map.get(cl) -1);
                left++;
            }

            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}
