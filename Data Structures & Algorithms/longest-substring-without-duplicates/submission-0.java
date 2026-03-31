class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int l = 0,  r =0,  ans = 0;
        
        if(s.isEmpty() || s.length() ==1){
            return s.length();
        }

        while(r < s.length()){
            
            while( set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            ans = Math.max(ans, r -l +1);
            r++;
        }

        return ans;
        
    }
}
