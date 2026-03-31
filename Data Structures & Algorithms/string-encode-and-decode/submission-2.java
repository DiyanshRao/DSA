class Solution {

    public String encode(List<String> strs) {

        String ans="";

        for(String itr : strs){
            ans += itr.length() + "#" + itr;
        }
        return ans;

    }

    public List<String> decode(String str) {
        
        List<String> sol = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            // Move j to find the '#' character
            while (str.charAt(j) != '#') {
                j++;
            }

            // Extract length of next string
            int len = Integer.parseInt(str.substring(i, j));

            // Get the string using length
            String code = str.substring(j + 1, j + 1 + len);
            sol.add(code);

            // Move to next encoded part
            i = j + 1 + len;
        }

        return sol;

    }
}
