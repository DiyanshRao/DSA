class Solution {
    public boolean isPalindrome(String s) {
        String sanitized = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        

        int i =0;
        int j = sanitized.length()-1;

        while(i<j){
            if(sanitized.charAt(i) != sanitized.charAt(j)){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

}
