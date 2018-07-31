import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap();

        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], i);
        }

        for(int j = 0; j < nums.length; j++)
        {
            int compliement = target - nums[j];
            if(map.containsKey(compliement) && map.get(compliement) != j)
            {
                return new int[] { j, map.get(compliement) };
            }
        }
        return new int[] { 0, 0 };
    }
}