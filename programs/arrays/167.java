// Two Sum Problem II 167
// same as two sum problem but with 1-based indexing make it +1 in the indexes 


class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement)+1, i +1};
            }
            map.put(nums[i], i);
        }
        
        return new int[] {-1, -1}; // if no solution
    }
}