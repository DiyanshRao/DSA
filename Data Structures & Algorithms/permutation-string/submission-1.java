class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        int matches =0;

        for(int i =0; i < s1.length();i++){
            count1[s1.charAt(i) -'a']++;
            count2[s2.charAt(i) -'a']++;
        } 

        for(int i =0; i < 26; i++){
            if(count1[i] == count2[i]){
                matches++;
            }
        }

        int start = 0;

        for(int i = s1.length(); i < s2.length(); i++){
            
            if(matches ==  26) return true;

            char ch = s2.charAt(i);
            int index = ch - 'a';
            count2[index]++;

            if(count1[index] == count2[index]){
                matches++;
            }else if(count1[index] +1 == count2[index]){
                matches--;
            }

            char cl = s2.charAt(start);
            index = cl - 'a';
            count2[index]--;

            if(count1[index] == count2[index]){
                matches++;
            }else if(count1[index] - 1 == count2[index]){
                matches--;
            }

            start++;

        }

        return matches == 26;

        

    }
}
