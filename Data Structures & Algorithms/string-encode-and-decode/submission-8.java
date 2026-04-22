class Solution {

    public String encode(List<String> strs) {
        StringBuilder build = new StringBuilder();
        for(String s : strs){
            int n = s.length();
            build.append(n).append('#').append(s);
        }

        return build.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        int i =0;

        while(i < str.length()){
            int len = 0;
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                len = len * 10 + (str.charAt(i) - '0');
                i++;
            }
            i++;
            String val = str.substring(i,i+len);
            ans.add(val);
            i +=len;

        }
        return ans;
    }
}
