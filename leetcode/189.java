class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;  // handle cases where k > nums.length
        reverse(nums, 0, nums.length - 1);       // Step 1: reverse entire array
        reverse(nums, 0, k - 1);                 // Step 2: reverse first k elements
        reverse(nums, k, nums.length - 1);       // Step 3: reverse the remaining elements
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];  
            nums[start] = nums[end];
            nums[end] = temp;
            start++;                 
            end--;
        }
    }
}

