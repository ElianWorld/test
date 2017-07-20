class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
        int result = 0;
        for(int i = 0;i<prices.length-1;i++)
        {
            int num = prices[i+1]-prices[i];
            if(num > 0) result += num;
        }
        return result;
    }
};