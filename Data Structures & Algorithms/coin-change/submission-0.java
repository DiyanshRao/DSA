class Solution {
    public int coinChange(int[] coins, int amount) {
        //memo array to store the coins require to each amount 
        //loop over that array
        //for every amount find the min couins required 

        int [] memo = new int[amount +1];
        Arrays.fill(memo, amount + 1);
        memo[0] = 0;

        for(int i =1; i <= amount; i++ ){

            for(int coin : coins){
                if(i - coin < 0) continue;
                memo[i] = Math.min(memo[i], memo[ i - coin] +1 );
            }
        }

        return memo[amount] > amount ? -1 : memo[amount];
    }
}
