class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder("");
        for ( String str : strs ) {
            int length = str.length();
            encodedString.append(length).append("#").append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        int pointer =0;
        List<String> sol = new ArrayList<>();
        

        while(pointer < str.length()){
            
            StringBuilder digit = new StringBuilder("");
            while(str.charAt(pointer) != '#'){
                digit = digit.append(str.charAt(pointer));
                pointer++;
            }
            pointer++;

            Integer len = Integer.parseInt(digit.toString());

            String curr = str.substring(pointer, len + pointer); 
            sol.add(curr);
            pointer += len;
        }
        return sol;

    }
}
