class Solution {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // write your code here
        for(int i = 1;i<A.length;i++)
        {
            if(A[i] > A[i-1]) continue;
            else return i-1;
        }
        return 0;
    }
}
