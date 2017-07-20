public class Solution {
    /**
     * @param heights: an array of integers
     * @return: an integer
     */
    public int maxArea(int[] heights) {
        // write your code here
        if(heights.length == 0) return 0;
        int max = 0;
        int left = 0, right = heights.length - 1;
        while(left != right)
        {
            int rol = (right-left)*(heights[left]<heights[right]?heights[left]:heights[right]);
            max = max < rol ? rol : max;
            if(heights[left] < heights[right]) left++;
            else right--;
        }
        return max;
    }
}