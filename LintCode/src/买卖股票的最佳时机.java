public class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
        if(prices.length == 0) return 0;
        int max = 0;
        int flag = prices[0];
        for(int i = 1;i< prices.length;i++)
        {
            if(prices[i] - flag <= 0) flag = prices[i];
            if(prices[i] - flag > max) max = prices[i] - flag;
        }
        return max;
    }
}