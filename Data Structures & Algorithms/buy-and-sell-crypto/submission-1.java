class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        int buy = prices[0];

        for(int i =1; i < prices.length; i++){
            profit = Math.max(prices[i] - buy,profit);
            buy = Math.min(prices[i],buy);
        }
        return profit;
    }
}
