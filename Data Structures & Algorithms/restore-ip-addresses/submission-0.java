class Solution {

    List<String> ans = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        if(s.length() > 12) return ans;
        backtrack(0,0,"" ,s);
        return ans;
    }

    private void backtrack(int idx, int dots, String curr, String s){
        if(dots == 4 && idx == s.length()){
            ans.add(curr.substring(0, curr.length() -1));
            return;
        }

        if(dots > 4 ) return;

        for(int j = idx; j < Math.min(idx + 3,  s.length()); j++){
            if(idx != j && s.charAt(idx) == '0') continue;

            if(Integer.parseInt(s.substring(idx,j + 1)) < 256){
                backtrack(j+1, dots +1, curr +s.substring(idx,j + 1) + ".", s );
            }
        }
    }
}