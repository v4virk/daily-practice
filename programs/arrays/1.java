// o(n^2) time complexity

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];

        for(int i = 0; i < (nums.length - 1); i++ ){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }

        return indices;
        
    }
}

// o(n) time complexity
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        
        List<Integer> li = Arrays.stream(nums)  // IntStream
                         .boxed()       // box to Integer
                         .toList();     // collect as List<Integer>


        for(int i = 0; i < (nums.length); i++ ){
            if(li.contains(target - nums[i]) && li.indexOf(target - nums[i]) != i){
                indices[0] = i;
                indices[1] = li.indexOf(target - nums[i]);
                
            }

        }

        return indices;
        
    }
}