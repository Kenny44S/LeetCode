class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        
        int i = 0;
        int index1, index2 = 0;
        
        for(i = 0; i < nums.length; i++)
        {
            index1 = i;

            for(int j = 1; j < nums.length; j++)
            {
                index2 = j;
                if( (nums[i] + nums[j]) == target)
                {
                    return new int[] { index1, index2 };
                }
            }
        }
        return new int[] { 0, 0 };
    }
}