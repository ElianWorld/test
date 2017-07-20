public class Solution {
    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here;
        int oushu = 0,jishu = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]%2 == 1) continue;
            int flag = 0;
            for(int j = i;j < nums.length;j++)
            {
                if(nums[j]%2 == 0) continue;
                else{
                    flag = j;
                    break;
                }
            }
            if(flag == 0) break;
            int k = nums[i];
            nums[i] = nums[flag];
            nums[flag] = k;
        }
    }
}