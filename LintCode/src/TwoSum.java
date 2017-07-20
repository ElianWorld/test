public class Solution {
    /*
     * @param nums an array of Integer
     * @param target = nums[index1] + nums[index2]
     * @return [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] nums, int target) {
        // write your code here
        for(int i = 0;i<nums.length;i++)
        {
            for(int j = i + 1;j<nums.length;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[]{i+1, j+1};
                }
            }
        }
        return null;
    }
}