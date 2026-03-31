class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int l =0,r=1;
        while(r < prices.length){
            if(prices[r] > prices[l]){
                int curr = prices[r] - prices[l];
                profit = Math.max(profit, curr);
            }else{
                l =r;
            }
            r++;
        }

        return profit;
        
    }
}
