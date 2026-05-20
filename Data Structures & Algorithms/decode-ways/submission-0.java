class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp,-1);
        return dfs(0,s,dp);
    }

    private int dfs(int idx, String s, int[]dp){
         if(idx == s.length()){
            return 1;
        }

        if(s.charAt(idx) == '0'){
            return 0;
        }

       

        if(dp[idx] != -1) return dp[idx];

        int count = dfs(idx +1 , s,dp);

        if(idx + 1 < s.length()){
            int num = (s.charAt(idx) - '0') * 10 +   (s.charAt(idx+1)-'0');

            if(num >=10 && num <=26){
                count +=dfs(idx+2,s,dp);
            }
        }

        return dp[idx] = count;
    }
}
