class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int [][] memo = new int[text1.length()][text2.length()];

        for(int[] x : memo){
            Arrays.fill(x,-1);
        }

        return dfs(0,0,text1,text2,memo);
        
    }
    private int dfs(int i, int j, String s, String t, int [][] memo){

        if(i == s.length() || j == t.length()){
            return 0;
        }

        if(memo[i][j] != -1) return memo[i][j];

        if(s.charAt(i) == t.charAt(j)){
            memo[i][j] = dfs(i+1,j+1,s,t,memo) +1;
        }else{
            memo[i][j] =  Math.max(dfs(i,j+1,s,t,memo), dfs(i +1, j, s,t,memo));
        }

        
        return memo[i][j];
    }
}
