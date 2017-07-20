public class Solution {
    /**
     * @param n, m: positive integer (1 <= n ,m <= 100)
     * @return an integer
     */
    public int uniquePaths(int m, int n) {
        // write your code here 
        double sum = 1;
        double number = 1;
        int k = m < n ? m : n;
        for(int i = 1;i < k;i++)
        {
            number = number * (n + m - 1 - i) / i;
        }
        return (int) number;
    }
    
}
