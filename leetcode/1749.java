// kadane's algorithm


class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int max_c = nums[0];
        int max_sum = nums[0];

        int min_c = nums[0];
        int min_sum = nums[0];



        for(int i = 1; i< nums.length; i++){
            max_c = Math.max(nums[i], max_c + nums[i] );
            max_sum = Math.max(max_sum, max_c);

            min_c = Math.min(nums[i], min_c + nums[i] );
            min_sum = Math.min(min_sum, min_c);
        }

        return Math.max(Math.abs(min_sum), Math.abs(max_sum));
        
    }
}
