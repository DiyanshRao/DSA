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
            String curr = "";
            String digit = "";
            while(str.charAt(pointer) != '#'){
                digit = digit + str.charAt(pointer);
                pointer++;
            }
            pointer++;

            Integer len = Integer.parseInt(digit) -1;

            while(len >=0){
                curr += str.charAt(pointer);
                pointer++;
                len--;
            }
            sol.add(curr);
        }
        return sol;

    }
}
