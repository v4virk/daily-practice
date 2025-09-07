// Find the missing number in an array containing n distinct numbers taken from 0, 1, 2, ..., n.

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        int l = nums.length;

        for(int i = 0 ; i<l; i++){
            if(nums[i] != i){
                return i;
            }
        }

        return l; // may be the last element is absent 
        
    }
}
